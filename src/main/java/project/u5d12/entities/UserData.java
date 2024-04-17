package project.u5d12.entities;

import javax.sql.DataSource;

public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }

    public static void main(String[] args) {
        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");
        // Imposta una data di nascita a caso per l'esempio
        info.setDataDiNascita(new Date(1990, 5, 15));

        InfoAdapter adapter = new InfoAdapter(info);

        UserData userData = new UserData();
        userData.getData(adapter);

        System.out.println("Nome Completo: " + userData.nomeCompleto);
        System.out.println("Età: " + userData.eta);
    }
}
