package br.edu.grupo4.conversorMoeda.login;
import br.edu.grupo4.conversorMoeda.mockdatabase.MockDataBase;

public class Login {
    public boolean auth (String user, String password) {
        if (user.equals(MockDataBase.adminUserName)) {
            if (password.equals(MockDataBase.adminPassword)) {
                return true;
            }
        }
        return false;
    }
}

