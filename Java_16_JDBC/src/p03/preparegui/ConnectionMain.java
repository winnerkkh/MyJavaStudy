package p03.preparegui;

import java.sql.Connection;

public class ConnectionMain {

   public static void main(String[] args) {
      Connection conn = Cons.getInstance().getConnection();
      if (conn == null)
         System.out.println("오류");

   }

}