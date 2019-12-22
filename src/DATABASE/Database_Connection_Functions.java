/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATABASE;

import java.io.File;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Atahan Ekici @TEAM_#6
 */
public class Database_Connection_Functions 
{
    private static Connection con;
    String Location = "C:\\OBASEB\\obaseb.db";
   
    void getConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("org.sqlite.JDBC");
        File directory = new File("C:\\OBASEB\\");
        
        if (directory.mkdir()) 
        { 
            System.out.println("Directory is created"); 
        } 

        con = DriverManager.getConnection("jdbc:sqlite:"+Location+"");
        System.out.println("Connection to SQLite has been established.");    
        
    }
     public void manuallyvacuumDB() throws ClassNotFoundException, SQLException
      {
           if(con == null)
        {
           getConnection();
         }
           try {
          PreparedStatement vacuum;
          vacuum = con.prepareStatement(" VACUUM;");
          vacuum.execute();
          } catch (SQLException e) 
        {
                    
           System.out.println(e.getCause());            
    }
      }
    
    /**
     *
     * @param tablename
     * @throws SQLException
     * @throws ClassNotFoundException
     */
   public void createTable(String tablename) throws SQLException, ClassNotFoundException
    {
        if(con == null)
        {
           getConnection();
         }
        try {
        PreparedStatement createdb;
        createdb = con.prepareStatement("create table if not exists "+tablename+"(id integer , value1 TEXT default unknown , value2 TEXT default unknown ,primary key(id));");
        createdb.execute();
        } catch (SQLException e) {
                    
           System.out.println(e.getCause());            
    } 
    }
   
    public void Conference(String tablename) throws SQLException, ClassNotFoundException
    {
        if(con == null)
        {
           getConnection();
         }
        try {
        PreparedStatement createdb;
        createdb = con.prepareStatement("CREATE TABLE \"Conference\" (\n" +
"	\"ID\"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,\n" +
"	\"Author\"	TEXT,\n" +
"	\"BookTitle\"	TEXT,\n" +
"	\"Year\"	INTEGER,\n" +
"	\"Editor\"	TEXT,\n" +
"	\"Volume\"	INTEGER,\n" +
"	\"Series\"	INTEGER,\n" +
"	\"Pages\"	INTEGER,\n" +
"	\"Address\"	TEXT,\n" +
"	\"Month\"	INTEGER,\n" +
"	\"Organization\"	TEXT,\n" +
"	\"Publisher\"	TEXT,\n" +
"	\"Note\"	TEXT\n" +
");");
        createdb.execute();
        } catch (SQLException e) {
                    
           System.out.println(e.getCause());            
    } 
    }
   
   
   public void createArticle() throws ClassNotFoundException, SQLException
   {  
       if(con == null)
        {
           getConnection();
        }

        try {
        PreparedStatement createdb;
        createdb = con.prepareStatement("CREATE TABLE \"Article\" (\n" +
"	\"ID\"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,\n" +
"	\"Author\"	TEXT,\n" +
"	\"Title\"	TEXT,\n" +
"	\"Year\"	INTEGER,\n" +
"	\"Number\"	INTEGER,\n" +
"	\"Pages\"	INTEGER,\n" +
"	\"Month\"	INTEGER,\n" +
"	\"Note\"	TEXT,\n" +
"	\"Volume\"	INTEGER\n" +
");");
        createdb.execute();
        } catch (SQLException e) {
                    
           System.out.println(e.getCause());            
    }        
   }
   
   public void createBook() throws ClassNotFoundException, SQLException
   {
     if(con == null)
        {
           getConnection();
         }
        try {
        PreparedStatement createdb;
        createdb = con.prepareStatement("CREATE TABLE \"Book\" (\n" +
"	\"ID\"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,\n" +
"	\"Author\"	TEXT,\n" +
"	\"Title\"	TEXT,\n" +
"	\"Publisher\"	TEXT,\n" +
"	\"Year\"	INTEGER,\n" +
"	\"Volume\"	INTEGER,\n" +
"	\"Series\"	INTEGER,\n" +
"	\"Address\"	TEXT,\n" +
"	\"Edition\"	INTEGER,\n" +
"	\"Month\"	INTEGER,\n" +
"	\"Note\"	TEXT,\n" +
"	\"ISBN\"	TEXT\n" +
");");
        createdb.execute();
        } catch (SQLException e) {
                    
           System.out.println(e.getCause());            
    } 
   }
   
     public void createIncollection() throws ClassNotFoundException, SQLException
   {
     if(con == null)
        {
           getConnection();
         }
        try {
        PreparedStatement createdb;
        createdb = con.prepareStatement("CREATE TABLE \"Incollection\" (\n" +
"	\"Author\"	TEXT,\n" +
"	\"Author\"	TEXT,\n" +
"	\"Title\"	TEXT,\n" +
"	\"Booktitle\"	TEXT,\n" +
"	\"Publisher\"	TEXT,\n" +
"	\"Year\"	INTEGER,\n" +
"	\"Editor\"	TEXT,\n" +
"	\"Volume\"	INTEGER,\n" +
"	\"Series\"	INTEGER,\n" +
"	\"Chapter\"	INTEGER,\n" +
"	\"Pages\"	INTEGER,\n" +
"	\"Address\"	TEXT,\n" +
"	\"Edition\"	INTEGER,\n" +
"	\"Month\"	INTEGER,\n" +
"	\"Note\"	TEXT\n" +
");");
        createdb.execute();
        } catch (SQLException e) {
                    
           System.out.println(e.getCause());            
    } 
   }

     public void createInbook() throws ClassNotFoundException, SQLException
   {
     if(con == null)
        {
           getConnection();
         }
        try {
        PreparedStatement createdb;
        createdb = con.prepareStatement("CREATE TABLE \"Inbook\" (\n" +
"	\"Author\"	TEXT,\n" +
"	\"Title\"	TEXT,\n" +
"	\"Chepter\"	INTEGER,\n" +
"	\"Pages\"	INTEGER,\n" +
"	\"Publisher\"	TEXT,\n" +
"	\"Year\"	INTEGER,\n" +
"	\"Volume\"	INTEGER,\n" +
"	\"Series\"	INTEGER,\n" +
"	\"Address\"	TEXT,\n" +
"	\"Edition\"	INTEGER,\n" +
"	\"Month\"	INTEGER,\n" +
"	\"Note\"	TEXT\n" +
");");
        createdb.execute();
        } catch (SQLException e) {
                    
           System.out.println(e.getCause());            
    } 
   }
     
      public void createManual() throws ClassNotFoundException, SQLException
   {
     if(con == null)
        {
           getConnection();
         }
        try {
        PreparedStatement createdb;
        createdb = con.prepareStatement("CREATE TABLE \"Manual\" (\n" +
"	\"ID\"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,\n" +
"	\"Title\"	TEXT,\n" +
"	\"Organization\"	TEXT,\n" +
"	\"Address\"	TEXT,\n" +
"	\"Edition\"	INTEGER,\n" +
"	\"Month\"	INTEGER,\n" +
"	\"Year\"	INTEGER,\n" +
"	\"Note\"	TEXT\n" +
");");
        createdb.execute();
        } catch (SQLException e) {
                    
           System.out.println(e.getCause());            
    } 
   }
     
   public void createAssociate()throws SQLException, ClassNotFoundException
    {
        if(con == null)
        {
           getConnection();
         }
        try {
        PreparedStatement createdb;
        createdb = con.prepareStatement("CREATE TABLE \"AssociatedTo\" (\n" +
"	\"ID\"	INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
"	\"Author1\"	INTEGER,\n" +
"	\"Author2\"	INTEGER,\n" +
"	CHECK(\"Author1\" <> \"Author2\")\n" +
");");
        createdb.execute();
        } catch (SQLException e) 
        {         
           System.out.println(e.getCause()); //hata raporu gelecek            
    }
    }
   
   
   public void createMasterThesis()throws SQLException, ClassNotFoundException
    {
        if(con == null)
        {
           getConnection();
         }
        try {
        PreparedStatement createdb;
        createdb = con.prepareStatement("CREATE TABLE \"MasterThesis\" (\n" +
"	\"ID\"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,\n" +
"	\"Author\"	TEXT,\n" +
"	\"Title\"	TEXT,\n" +
"	\"School\"	TEXT,\n" +
"	\"Year\"	INTEGER,\n" +
"	\"Address\"	TEXT,\n" +
"	\"Month\"	INTEGER,\n" +
"	\"Note\"	TEXT\n" +
");");
        createdb.execute();
        } catch (SQLException e) 
        {         
           System.out.println(e.getCause()); //hata raporu gelecek            
    }
    }
   
   
   public void createMisc()throws SQLException, ClassNotFoundException
    {
        if(con == null)
        {
           getConnection();
         }
        try {
        PreparedStatement createdb;
        createdb = con.prepareStatement("CREATE TABLE \"Misc\" (\n" +
"	\"ID\"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,\n" +
"	\"Author\"	TEXT,\n" +
"	\"Title\"	TEXT,\n" +
"	\"HowPublished\"	TEXT,\n" +
"	\"Month\"	INTEGER,\n" +
"	\"Year\"	INTEGER,\n" +
"	\"Note\"	TEXT\n" +
");");
        createdb.execute();
        } catch (SQLException e) 
        {         
           System.out.println(e.getCause()); //hata raporu gelecek            
    }
    }
   
   public void createPhdThesis()throws SQLException, ClassNotFoundException
    {
        if(con == null)
        {
           getConnection();
         }
        try {
        PreparedStatement createdb;
        createdb = con.prepareStatement("CREATE TABLE \"PhdThesis\" (\n" +
"	\"ID\"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,\n" +
"	\"Author\"	TEXT,\n" +
"	\"Title\"	TEXT,\n" +
"	\"School\"	TEXT,\n" +
"	\"Year\"	INTEGER,\n" +
"	\"Address\"	TEXT,\n" +
"	\"Month\"	INTEGER,\n" +
"	\"Note\"	TEXT\n" +
");");
        createdb.execute();
        } catch (SQLException e) 
        {         
           System.out.println(e.getCause()); //hata raporu gelecek            
    }
    }
   
   public void createProceedings()throws SQLException, ClassNotFoundException
    {
        if(con == null)
        {
           getConnection();
         }
        try {
        PreparedStatement createdb;
        createdb = con.prepareStatement("CREATE TABLE \"Proceedings\" (\n" +
"	\"ID\"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,\n" +
"	\"Title\"	TEXT,\n" +
"	\"Year\"	INTEGER,\n" +
"	\"Editor\"	TEXT,\n" +
"	\"Volume\"	INTEGER,\n" +
"	\"Series\"	INTEGER,\n" +
"	\"Address\"	TEXT,\n" +
"	\"Month\"	INTEGER,\n" +
"	\"Organization\"	TEXT,\n" +
"	\"Publisher\"	TEXT,\n" +
"	\"Note\"	TEXT\n" +
");");
        createdb.execute();
        } catch (SQLException e) 
        {         
           System.out.println(e.getCause()); //hata raporu gelecek            
    }
    }
   
   public void createTechReport()throws SQLException, ClassNotFoundException
    {
        if(con == null)
        {
           getConnection();
         }
        try {
        PreparedStatement createdb;
        createdb = con.prepareStatement("CREATE TABLE \"TechReport\" (\n" +
"	\"ID\"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,\n" +
"	\"Author\"	TEXT,\n" +
"	\"Title\"	TEXT,\n" +
"	\"Institution\"	TEXT,\n" +
"	\"Year\"	INTEGER,\n" +
"	\"Number\"	INTEGER,\n" +
"	\"Address\"	TEXT,\n" +
"	\"Month\"	INTEGER,\n" +
"	\"Note\"	TEXT\n" +
");");
        createdb.execute();
        } catch (SQLException e) 
        {         
           System.out.println(e.getCause()); //hata raporu gelecek            
    }
    }
   
     public void createUnpublished()throws SQLException, ClassNotFoundException
    {
        if(con == null)
        {
           getConnection();
         }
        try {
        PreparedStatement createdb;
        createdb = con.prepareStatement("CREATE TABLE \"Unpublished\" (\n" +
"	\"ID\"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,\n" +
"	\"Author\"	TEXT,\n" +
"	\"Title\"	TEXT,\n" +
"	\"Note\"	TEXT,\n" +
"	\"Month\"	INTEGER,\n" +
"	\"Year\"	INTEGER\n" +
");");
        createdb.execute();
        } catch (SQLException e) 
        {         
           System.out.println(e.getCause()); //hata raporu gelecek            
    }
    }
     
    public void Associate(String aut1,String aut2) throws SQLException, ClassNotFoundException
    {
        if(con == null)
        {
           getConnection();
         }
        try {
        PreparedStatement createdb;
        
        createdb = con.prepareStatement("INSERT INTO AssociatedTo(Author1,Author2)\n" +
"VALUES('"+aut1+"','"+aut2+"');");
        createdb.execute();
        } catch (SQLException e) {
                    
           System.out.println(e.getCause()); //hata raporu gelecek            
    }
    }
    
    public boolean isAssociated(String aut1,String aut2) throws SQLException, ClassNotFoundException
    {
        if(con == null)
        {
           getConnection();
         }
        try {
        PreparedStatement createdb;
        
        createdb = con.prepareStatement("");
        createdb.execute();
        } catch (SQLException e) 
        {
                    
           System.out.println(e.getCause()); //hata raporu gelecek            
    }
        return false;
    }
   
   
     public void dropTable(String tablename) throws SQLException, ClassNotFoundException
      {
          if(con == null)
        {
           getConnection();
         }
          
           try {
      
              try (Statement stmt = con.createStatement()) {
                  String sqlCommand = "DROP TABLE IF EXISTS "+tablename+";";
                  stmt.executeUpdate(sqlCommand);
              }
          con.commit();    
          manuallyvacuumDB();
          
           }catch(SQLException e)
        {           
           System.out.println(""+tablename+" adlı bir tablo yok");  
        }
      }
    
    public ArrayList displayTable(String tablename) throws ClassNotFoundException, SQLException
    {
        if(con == null)
        {
           getConnection();
         }
         ArrayList a = new ArrayList();
        try {
           PreparedStatement displayTable;
           displayTable = con.prepareStatement("SELECT * FROM "+tablename+"");
           displayTable.execute();
           DatabaseMetaData md = con.getMetaData();
           ResultSet rs = md.getTables(null, null, "%", null);

           while(rs.next())
           {
               a.add(rs.getString(3));
           }
        
        } catch (SQLException e) 
        {                    
           //hata raporu gelmeli            
        }
        return a;
    }
    
    public static void getColumns(String tablename) throws SQLException
    {
        
        PreparedStatement createdb;
        createdb = con.prepareStatement("PRAGMA table_info("+tablename+");");
        createdb.execute();
    }
    
    
     public void renametable(String tablename , String new_name) throws SQLException, ClassNotFoundException
    {
        if(con == null)
        {
           getConnection();
        }
        
         try {
        PreparedStatement renametable;
        renametable = con.prepareStatement(" alter table  "+ tablename +" rename to "+ new_name +";");
        renametable.execute();   
        } catch (SQLException e) {
                    
          // hata raporu gelecek //          
    }
    }
     
           public void displaySpecifictable(String tablename) throws SQLException, ClassNotFoundException
      {
          if(con == null)
        {
           getConnection();
        }
       
           try {
           DatabaseMetaData md = con.getMetaData();
           ResultSet rs = md.getTables(null, null, "%", null);           
            
           while(rs.next())
           {
                System.out.println(rs.getString(3));
           }  
           } catch (SQLException e) 
        {
                    
           System.out.println(e.getCause());            
    }
      }
           
           public ArrayList<String> DisplayAllTablesReturns() throws SQLException, ClassNotFoundException
   {   
       if(con == null)
        {
           getConnection();
        }
try{
           ArrayList<String> mylist = new ArrayList<>();
           DatabaseMetaData md = con.getMetaData();
           ResultSet rs = md.getTables(null, null, "%", null);           
            
           while(rs.next())
           {
               mylist.add(rs.getString(3));
           }
           
         return (mylist);
}
catch(SQLException e)
{   
    System.out.println("Error displaying tables");
}
return (null);
   
  }
           
           public void DisplayAllTables() throws SQLException, ClassNotFoundException
      {
       if(con == null)
        {
           getConnection();
        }
       
           try {
           DatabaseMetaData md = con.getMetaData();
           ResultSet rs = md.getTables(null, null, "%", null);           
            
           while(rs.next())
           {
                System.out.println(rs.getString(3));
           }  
           } catch (SQLException e) 
        {
                    
           System.out.println(e.getCause());            
    }
      }
           
            public  ArrayList<String>  getAllColumns(int row) throws SQLException, ClassNotFoundException
         {
           if(con == null)
        {
           getConnection();
        }  
           
           try{
                         
          ArrayList<String> DisplayAllTablesReturns = DisplayAllTablesReturns();
          ArrayList<String> columns = new ArrayList<>();
          String tablename; 
          tablename  = DisplayAllTablesReturns.get(row);
          
          Statement GetValueAt = Database_Connection_Functions.con.createStatement();
          ResultSet rs = GetValueAt.executeQuery("PRAGMA table_info(" + tablename + ")");
          
          while(rs.next())
          {
              columns.add(rs.getString(row));
          }
          return (columns);
         }
           catch(SQLException e)
         {
             System.out.println("No information on table#"+ row +"");
         }
        return null;
         }

    
}
  
