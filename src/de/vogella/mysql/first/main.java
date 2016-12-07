package de.vogella.mysql.first;

import de.vogella.mysql.first.mysqlaccess;

public class main {
  public static void main(String[] args) throws Exception {
    mysqlaccess dao = new mysqlaccess();
    dao.readDataBase();
  }

}