/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATABASE;

import java.sql.SQLException;

public class Test_Function
{

    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        Database_Connection_Functions db = new Database_Connection_Functions(); //Veritabanı Oluşturma  //
        
        db.getConnection(); // Gömülü Veritabanı Bağlantı Fonksiyonunu çağırma //

        db.createtable("rap"); // random değer atama //
        db.createtable("Vosvos");
        db.createtable("Graphicscards");
        db.createtable("Books");
        db.renametable("vosvos", "Cars");
        db.renametable("rap", "Musics");
  
        db.DisplayAllTables(); // Tablolardaki veriyi gösteren Fonksiyon //
        
        System.out.println(db.DisplayAllTablesReturns());
        System.out.println(db.getTotalColumn());
        System.out.println(db.getTotalRow()); 
        
        System.out.println(db.getAllColumns(2));
        
        db.addAttributeInt("books", "deneme");
        db.createItem("books","deneme" );
        System.out.println(db. getAllAttributes("Books"));  // Test Bitişi //
 
        
/*  //Terminal Komutu kullanılmak için ayrılan alan //
        db.Terminal("");
        db.Terminal("");
        db.Terminal("");
        db.Terminal("");
        db.Terminal("");
        db.Terminal("");
        db.Terminal("");
*/
    } 
}