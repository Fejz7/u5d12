package project.u5d12.entities;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {

        Calendar dataDiNascita = Calendar.getInstance();
        dataDiNascita.setTime(info.getDataDiNascita());
        Calendar oggi = Calendar.getInstance();
        int annoDiNascita = dataDiNascita.get(Calendar.YEAR);
        int annoCorrente = oggi.get(Calendar.YEAR);
        int eta = annoCorrente - annoDiNascita;
        if (oggi.get(Calendar.DAY_OF_YEAR) < dataDiNascita.get(Calendar.DAY_OF_YEAR)) {
            eta--;
        }
        return eta;
    }

    @Override
    public Connection getConnection() throws SQLException {
        return null;
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}
