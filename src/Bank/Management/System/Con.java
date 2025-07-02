package Bank.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Con {
    Connection conection;
    Statement statement;
    public Con(){
        try{
            conection= DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","uday123");
            statement=conection.createStatement();



        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
