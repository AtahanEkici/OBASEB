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
/*
        db.createtable("rap"); // random değer atama // // Fonksiyon Testleri //
        db.createtable("Vosvos");
        db.createtable("Graphicscards");
        db.createtable("books");
        db.renametable("vosvos", "Cars");
        db.renametable("rap", "Musics");
  
        db.DisplayAllTables(); // Tablolardaki veriyi gösteren Fonksiyon //
        
        System.out.println(db.DisplayAllTablesReturns());
        System.out.println(db.getTotalColumn());
        System.out.println(db.getTotalRow()); 
       
        System.out.println(db.getAllColumns(2));
        System.out.println(db. getAllAttributes("books"));
        */ 
       db.droptable("GraphicsCards");
        db.DisplayAllTables();

        //drop fonksiyonuna yeniden bakılacak  unutulmamalı//

// Test Bitişi //
 
        
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