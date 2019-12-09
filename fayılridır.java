package BibTeX;

import Swing.Obaseb_Gui;
import java.io.File;
import java.io.FileNotFoundException;
import org.jbibtex.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class fayılridır
{
    static ArrayList<String> parsebibManual(File file) throws FileNotFoundException
    {
        try
                        {
                            BibTeXDatabase database = parseBibTeX(file); 
                            formatBibTeX(database, file);
                        }catch(ParseException p)
                        {
                            System.out.print("Okunmaya çalışan dosyada hata var ya da boş"); //pop up uyarısı verecek
                        }catch(FileNotFoundException f)
                        {
                            System.out.print("Dosya bulunamadı ya da açılamıyor."); //pop up uyarısı verecek
                        }                   catch (IOException | ObjectResolutionException ex) {
                            Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                      ArrayList values;
                      values = new ArrayList<>();
                        
                        try (Scanner in = new Scanner(file))
                        {
                            String title = in.nextLine();                         
                            String manual ="@manual";

                            while(in.hasNext())
                            {
                                if(title.contains(manual) == true)
                                {
                                    title = in.nextLine().trim();
                                    title = title.split("=")[1];
                                    values.add(title);
                                    
                                    String author = in.nextLine().trim();
                                    author = author.split("=")[1];
                                    values.add(author);
                                    
                                    String organization = in.nextLine().trim();
                                    organization = organization.split("=")[1]; 
                                    values.add(organization);
                                    
                                    String address = in.nextLine().trim();
                                    address = address.split("=")[1];
                                    values.add(address);
                                    
                                    String edition = in.nextLine().trim();
                                    edition = edition.split("=")[1];
                                    values.add(edition);
                                          
                                    String month = in.nextLine().trim();
                                    month = month.split("=")[1];
                                    values.add(month);
   
                                    String year = in.nextLine().trim();
                                    year = year.split("=")[1];
                                    values.add(year);
                                    
                                    String note = in.nextLine().trim();
                                    note = note.split("=")[1];
                                    values.add(note);                                  
                                    return values;
                                } 
                                else
                                {
                                    title =in.nextLine();
                                }
                            }
                        }
        return null;
    
   }

     static ArrayList<String> parsebibMisc(File file) throws FileNotFoundException
    {
        try
                        {
                            BibTeXDatabase database = parseBibTeX(file);
                            
                            formatBibTeX(database, file);
                        }catch(ParseException p)
                        {
                            System.out.print("Okunmaya çalışan dosyada hata var ya da boş"); //pop up uyarısı verecek
                        }catch(FileNotFoundException f)
                        {
                            System.out.print("Dosya bulunamadı ya da açılamıyor."); //pop up uyarısı verecek
                        }                   catch (IOException | ObjectResolutionException ex) {
                            Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                      ArrayList values;
                      values = new ArrayList<>();
                        
                        try (Scanner in = new Scanner(file))
                        {
                            String author = in.nextLine();                         
                            String misc ="@misc";

                            while(in.hasNext())
                            {
                                if(author.contains(misc))
                                {
                                    author = in.nextLine();
                                    author = author.split("=")[1];
                                    values.add(author);
                                    
                                    String title = in.nextLine();
                                    title = title.split("=")[1];
                                    values.add(title);
                                    
                                    String howpublished = in.nextLine();
                                    howpublished = howpublished.split("=")[1];
                                    values.add(howpublished);
                                    
                                    String month = in.nextLine();
                                    month = month.split("=")[1];
                                    values.add(month);
                                    
                                    String year = in.nextLine();
                                    year = year.split("=")[1];
                                    values.add(year);
                                    
                                    String note = in.nextLine();
                                    values.add(note);  
                                    return values;
                                }
                                
                                else
                                {
                                    author = in.nextLine();
                                }
                            }
                        }
        return null;
    }
    

     static ArrayList<String> parsebibPhdthesis(File file) throws FileNotFoundException
    {
        try
                        {
                            BibTeXDatabase database = parseBibTeX(file);
                            
                            formatBibTeX(database, file);
                        }catch(ParseException p)
                        {
                            System.out.print("Okunmaya çalışan dosyada hata var ya da boş"); //pop up uyarısı verecek
                        }catch(FileNotFoundException f)
                        {
                            System.out.print("Dosya bulunamadı ya da açılamıyor."); //pop up uyarısı verecek
                        }                   catch (IOException | ObjectResolutionException ex) {
                            Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                      ArrayList values;
                      values = new ArrayList<>();
                        
                        try (Scanner in = new Scanner(file))
                        {
                            String author = in.nextLine();                         
                            String phdthesis ="@phdthesis";

                            while(in.hasNext())
                            {
                                
                                if(author.contains(phdthesis))
                                {
                                    author = in.nextLine();
                                    author = author.split("=")[1];
                                    values.add(author);
                                    
                                    String title = in.nextLine();
                                    title = title.split("=")[1];
                                    values.add(title);
                                    
                                    String school = in.nextLine();
                                    school = school.split("=")[1];
                                    values.add(school);
                                    
                                    String year = in.nextLine();
                                    year = year.split("=")[1];
                                    values.add(year);
                                    
                                    String address = in.nextLine();
                                    address = address.split("=")[1];
                                    values.add(address);
                                    
                                    String month = in.nextLine();
                                    month = month.split("=")[1];
                                    values.add(month);
                                    
                                    String note = in.nextLine();
                                    note = note.split("=")[1];
                                    values.add(note);
                                    return values;
                                }
                                else
                                {
                                    author = in.nextLine();
                                }
                            }
                        }
return null;
    }
     
      static ArrayList<String> parsebibUnpublished(File file) throws FileNotFoundException
    {
        try
                        {
                            BibTeXDatabase database = parseBibTeX(file);
                            
                            formatBibTeX(database, file);
                        }catch(ParseException p)
                        {
                            System.out.print("Okunmaya çalışan dosyada hata var ya da boş"); //pop up uyarısı verecek
                        }catch(FileNotFoundException f)
                        {
                            System.out.print("Dosya bulunamadı ya da açılamıyor."); //pop up uyarısı verecek
                        }                   catch (IOException | ObjectResolutionException ex) {
                            Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                      ArrayList values;
                      values = new ArrayList<>();
                        
                        try (Scanner in = new Scanner(file))
                        {
                            String author = in.nextLine();                         
                            String unpublished ="@unpublished";

                            while(in.hasNext())
                            {
                                if(author.contains(unpublished))
                                {
                                    author = in.nextLine().trim();
                                    author = author.split(",")[0];
                                    values.add(author);
                                    
                                    String title = in.nextLine().trim();
                                    title = title.split("=")[1];
                                    values.add(title);
                                    
                                    String note = in.nextLine().trim();
                                    note = note.split("=")[1];
                                    values.add(note); 
                                    
                                    String month = in.nextLine().trim();
                                    month = month.split("=")[1];
                                    values.add(month);
                                     
                                   String year = in.nextLine().trim();
                                    year = year.split("=")[1];
                                    values.add(year);   
                                    return values;
                                }
                                else
                                {
                                    author = in.nextLine();
                                }
                            }
                        }
        return null;
    }

     static ArrayList<String> parsebibTechreport(File file) throws FileNotFoundException
    {
        try
                        {
                            BibTeXDatabase database = parseBibTeX(file);
                            
                            formatBibTeX(database, file);
                        }catch(ParseException p)
                        {
                            System.out.print("Okunmaya çalışan dosyada hata var ya da boş"); //pop up uyarısı verecek
                        }catch(FileNotFoundException f)
                        {
                            System.out.print("Dosya bulunamadı ya da açılamıyor."); //pop up uyarısı verecek
                        }                   catch (IOException | ObjectResolutionException ex) {
                            Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                      ArrayList values;
                      values = new ArrayList<>();
                        
                        try (Scanner in = new Scanner(file))
                        {
                            String author = in.nextLine();                         
                            String techreport ="@techreport";

                            while(in.hasNext())
                            {
                                if(author.contains(techreport))
                                {
                                    author = in.nextLine().trim();
                                    author = author.split(",")[0];
                                    values.add(author);
                                    
                                    String title = in.nextLine().trim();
                                    title = title.split("=")[1];
                                    values.add(title);
                                     
                                    String institution = in.nextLine().trim();
                                    institution = institution.split("=")[1];
                                    values.add(institution);
                                    
                                    String year = in.nextLine().trim();
                                    year = year.split("=")[1];
                                    values.add(year);
                                    
                                    String number = in.nextLine().trim();
                                    number = number.split("=")[1];
                                    values.add(number);
                                    
                                    String address = in.nextLine().trim();
                                    address = address.split("=")[1]; 
                                    values.add(address);
                                    
                                    String month = in.nextLine().trim();
                                    month = month.split("=")[1];
                                    values.add(month);
                                    
                                    String note = in.nextLine().trim();
                                    note = note.split("=")[1];
                                    values.add(note);  
                                    return values;
                                }
                                else
                                {
                                    author = in.nextLine();
                                }
                            }
                        }
        return null;
    }

     
     static ArrayList<String> parsebibProceedings(File file) throws FileNotFoundException
    {
        try
                        {
                            BibTeXDatabase database = parseBibTeX(file);
                            
                            formatBibTeX(database, file);
                        }catch(ParseException p)
                        {
                            System.out.print("Okunmaya çalışan dosyada hata var ya da boş"); //pop up uyarısı verecek
                        }catch(FileNotFoundException f)
                        {
                            System.out.print("Dosya bulunamadı ya da açılamıyor."); //pop up uyarısı verecek
                        }                   catch (IOException | ObjectResolutionException ex) {
                            Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                      ArrayList values;
                      values = new ArrayList<>();
                        
                        try (Scanner in = new Scanner(file))
                        {
                            String title = in.nextLine();                         
                            String proceedings ="@proceedings";

                            while(in.hasNext())
                            {
                                if(title.contains(proceedings))
                                {
                                    title = in.nextLine().trim();
                                    title = title.split("=")[1];                                 
                                    values.add(title);
                                    
                                    String year = in.nextLine();
                                    year = year.split("=")[1];                             
                                    values.add(year);
                                    
                                    String editor = in.nextLine();
                                    editor = editor.split("=")[1];                                
                                    values.add(editor);
                                    
                                    String volume = in.nextLine();
                                    volume = volume.split("=")[1];                            
                                    values.add(volume);
                                    
                                    String series = in.nextLine();
                                    series = series.split("=")[1];                             
                                    values.add(series);
                                    
                                    String address = in.nextLine();
                                    address = address.split("=")[1];                                  
                                    values.add(address);
                                    
                                    String month = in.nextLine();
                                    month = month.split("=")[1];                             
                                    values.add(month);
                                    
                                    String organization = in.nextLine();
                                    organization = organization.split("=")[1];                                
                                    values.add(organization);
                                    
                                    String publisher = in.nextLine();
                                    publisher = publisher.split("=")[1];                                  
                                    values.add(publisher);
                                    
                                    String note = in.nextLine();
                                    note = note.split("=")[1];                                  
                                    values.add(note);    
                                    return values;
                                }
                                else
                                {
                                   title = in.nextLine();
                                }
                            }
                        }
        return null;
    }
     
    static ArrayList<String> parsebibMastersthesis(File file) throws FileNotFoundException
    {
        try
                        {
                            BibTeXDatabase database = parseBibTeX(file);
                            
                            formatBibTeX(database, file);
                        }catch(ParseException p)
                        {
                            System.out.print("Okunmaya çalışan dosyada hata var ya da boş"); //pop up uyarısı verecek
                        }catch(FileNotFoundException f)
                        {
                            System.out.print("Dosya bulunamadı ya da açılamıyor."); //pop up uyarısı verecek
                        }                   catch (IOException | ObjectResolutionException ex) {
                            Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                      ArrayList values;
                      values = new ArrayList<>();
                        
                        try (Scanner in = new Scanner(file))
                        {
                            String author = in.nextLine();                         
                            String mastersthesis ="@mastersthesis";

                            while(in.hasNext())
                            {
                                if(author.contains(mastersthesis))
                                {
                                    author = in.nextLine().trim();
                                    author = author.split("=")[1];
                                    values.add(author);
                                    
                                    String title = in.nextLine().trim();
                                    title = title.split("=")[1];
                                    values.add(title);
                                    
                                    String school = in.nextLine().trim();
                                    school = school.split("=")[1];
                                    values.add(school);
                                    
                                    String year = in.nextLine().trim();
                                    year = year.split("=")[1];                            
                                    values.add(year);
                                    
                                    String address = in.nextLine().trim();
                                    address = address.split("=")[1]; 
                                    values.add(address);

                                    String month = in.nextLine().trim();
                                    month = month.split("=")[1];                             
                                    values.add(month);
                                    
                                    String note = in.nextLine().trim();
                                    note = note.split("=")[1];
                                    values.add(note); 
                                    return values;
                                }
                                
                                else
                                {
                                    author = in.nextLine();
                                }
                            }
                        }
        return null;
    }

    static ArrayList<String> parsebibInbook(File file) throws FileNotFoundException
    {
        try
                        {
                            BibTeXDatabase database = parseBibTeX(file);
                            
                            formatBibTeX(database, file);
                        }catch(ParseException p)
                        {
                            System.out.print("Okunmaya çalışan dosyada hata var ya da boş"); //pop up uyarısı verecek
                        }catch(FileNotFoundException f)
                        {
                            System.out.print("Dosya bulunamadı ya da açılamıyor."); //pop up uyarısı verecek
                        }                   catch (IOException | ObjectResolutionException ex) {
                            Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                      ArrayList values;
                      values = new ArrayList<>();
                        
                        try (Scanner in = new Scanner(file))
                        {
                            String author = in.nextLine();                         
                            String inbook ="@inbook";

                            while(in.hasNext())
                            {
                                if(author.contains(inbook))
                                {
                                    author = in.nextLine().trim();
                                    author = author.split("=")[1];
                                    values.add(author);
                                    
                                    String title = in.nextLine().trim();
                                    title = title.split("=")[1];
                                    values.add(title);
                                    
                                    String chapter = in.nextLine().trim();
                                    chapter = chapter.split("=")[1];
                                    values.add(chapter);
                                    
                                    String pages = in.nextLine().trim();
                                    pages = pages.split("=")[1];
                                    pages = pages.split("\\}")[0];
                                    pages = pages.split("\\{")[1];
                                    values.add(pages);
                                    
                                    String publisher = in.nextLine().trim();
                                    publisher = publisher.split("=")[1];
                                    values.add(publisher);
                                    
                                    String year = in.nextLine().trim();
                                    year = year.split("=")[1];
                                    values.add(year);
                                    
                                    String volume = in.nextLine().trim();
                                    volume = volume.split("=")[1];
                                    values.add(volume);
                                    
                                    String series = in.nextLine().trim();
                                    series = series.split("=")[1];
                                    values.add(series);
                                    
                                    String address = in.nextLine().trim();
                                    address = address.split("=")[1];
                                    values.add(address);
                                    
                                    String edition = in.nextLine().trim();
                                    edition = edition.split("=")[1];
                                    values.add(edition);
                                    
                                    String month = in.nextLine().trim();
                                    month = month.split("=")[1];
                                    values.add(month);
                                    
                                    String note = in.nextLine().trim();
                                    note = note.split("=")[1];
                                    values.add(note);
                                    return values;
                                }
                                
                                else
                                {
                                    author = in.nextLine();
                                }
                                
                            }
                        }
        return null;
    }

    static  ArrayList<String> parsebibConference(File file) throws FileNotFoundException
    {
        try
                        {
                            BibTeXDatabase database = parseBibTeX(file); 
                            formatBibTeX(database, file);
                        }catch(ParseException p)
                        {
                            System.out.print("Okunmaya çalışan dosyada hata olabilir"); //pop up uyarısı verecek
                        }catch(FileNotFoundException f)
                        {
                            System.out.print("Dosya bulunamadı ya da açılamıyor."); //pop up uyarısı verecek
                        }                   catch (IOException | ObjectResolutionException ex) {
                            Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        ArrayList values;
                        values = new ArrayList<>();
                        try (Scanner in = new Scanner(file))
                        {
                            String author = in.nextLine();
                            
                            String conference ="@conference";
                            
                             while(in.hasNext())
                            {
                                if(author.contains(conference))
                                {
                                    author = in.nextLine();
                                    author = author.split("=")[1];
                                    values.add(author);
                                                                
                                    String title = in.nextLine();
                                    title = title.split("=")[1];
                                    values.add(title);
                                                                
                                    String booktitle = in.nextLine();
                                    booktitle = booktitle.split("=")[1];
                                    values.add(booktitle);
                                                                       
                                    String year = in.nextLine();
                                    year = year.split("=")[1];
                                    values.add(year);
                                                                      
                                    String editor = in.nextLine();
                                    editor = editor.split("=")[1];
                                    values.add(editor);
                                        
                                    String volume = in.nextLine();
                                    volume = volume.split("=")[1];
                                    values.add(volume);
                                                                       
                                    String series = in.nextLine();
                                    series = series.split("=")[1];
                                    values.add(series);
                                                                    
                                    String pages = in.nextLine();
                                    pages = pages.split("=")[1];
                                    values.add(pages);
                                                                       
                                    String address = in.nextLine();
                                    address = address.split("=")[1];
                                    values.add(address);
                                                  
                                    String month = in.nextLine();
                                    month = month.split("=")[1];
                                    values.add(month);
                                                                                              
                                    String organization = in.nextLine();
                                    organization = organization.split("=")[1];
                                    values.add(organization);
                                                               
                                    String publisher = in.nextLine();
                                    publisher = publisher.split("=")[1];
                                    values.add(publisher);
                                                        
                                    String note = in.nextLine();
                                    note = note.split("=")[1];
                                    values.add(note);                             
                                    return values;                          
                                }  
                                else
                                {
                                    author = in.nextLine();
                                }
                            }
                        }
        return null;
                        
    }


     static ArrayList<String> parsebibBooklet(File file) throws FileNotFoundException
    {
        try
                        {
                            BibTeXDatabase database = parseBibTeX(file); 
                            formatBibTeX(database, file);
                        }catch(ParseException p)
                        {
                            System.out.print("Okunmaya çalışan dosyada hata olabilir"); //pop up uyarısı verecek
                        }catch(FileNotFoundException f)
                        {
                            System.out.print("Dosya bulunamadı ya da açılamıyor."); //pop up uyarısı verecek
                        }                   catch (IOException | ObjectResolutionException ex) {
                            Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                      ArrayList values;
                      values = new ArrayList<>();
                        
                        try (Scanner in = new Scanner(file))
                        {
                            String title = in.nextLine();
                            
                            String booklet ="@booklet";
                            
                             while(in.hasNext())
                            {
                                if(title.contains(booklet))
                                { 
                                   title = in.nextLine();
                                   title = title.split("=")[1];
                                   values.add(title);
                                   
                                   String author = in.nextLine();
                                   author = author.split("=")[1];
                                   values.add(author);
                                   
                                   String howpublished = in.nextLine();
                                   howpublished = howpublished.split("=")[1];
                                   values.add(howpublished);
                                   
                                   String address = in.nextLine();
                                   address = address.split("=")[1];
                                   values.add(address);
                                   
                                   String month = in.nextLine();
                                   month = month.split("=")[1];
                                   values.add(month);
                                   
                                   String year = in.nextLine();
                                   year = year.split("=")[1];
                                   values.add(year);  
                                   return values; 
                                }
                                
                                else
                                {
                                    title = in.nextLine();
                                }  
                            }
                
                        }
        return null;
    }
    
    
   static ArrayList<String> parsebibBook(File file) throws FileNotFoundException
    {
        try
                        {
                            BibTeXDatabase database = parseBibTeX(file); 
                            formatBibTeX(database, file);
                        }catch(ParseException p)
                        {
                            System.out.print("Okunmaya çalışan dosyada hata olabilir"); //pop up uyarısı verecek
                        }catch(FileNotFoundException f)
                        {
                            System.out.print("Dosya bulunamadı ya da açılamıyor."); //pop up uyarısı verecek
                        }                   catch (IOException | ObjectResolutionException ex) {
                            Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                      ArrayList values;
                      values = new ArrayList<>();
                        
                        try (Scanner in = new Scanner(file))
                        {
                            String author = in.nextLine();
                            String book ="@book";
                            
                              while(in.hasNext())
                            {
                                if(author.contains(book))
                                {
                                    
                             author = in.nextLine().trim();
                             author = author.split("=")[1];
                             values.add(author);
                               
                              String title = in.nextLine().trim();
                              title = title.split("=")[1];
                             values.add(title);
                              
                             String publisher = in.nextLine().trim();
                              publisher = publisher.split("=")[1];
                             values.add(publisher);
                             
                             String year = in.nextLine().trim();
                             year = year.split("=")[1];
                             values.add(year);
                             
                             String volume = in.nextLine().trim();
                             volume = volume.split("=")[1];
                             values.add(volume);
                             
                             String series = in.nextLine().trim();
                             series = series.split("=")[1];
                             values.add(series);
                             
                             String address = in.nextLine().trim();
                             address = address.split("=")[1];
                             values.add(address);
                             
                             String edition = in.nextLine().trim();
                             edition = edition.split("=")[1]; 
                             values.add(edition);
                             
                             String month = in.nextLine().trim();
                             month = month.split("=")[1];
                             values.add(month);
                             
                             String note = in.nextLine().trim();
                             note = note.split("=")[1];
                             values.add(note);
                                          
                             String isbn = in.nextLine().trim();
                             isbn = isbn.split("=")[1];
                             values.add(isbn);
                             
                             return values;
                                }
                                else
                                {
                                    author = in.nextLine();  
                                }      
                            }
                        }                
        return null;
    }

     static ArrayList <String> parsebibIncollection(File file) throws FileNotFoundException
    {
        try
                        {
                            BibTeXDatabase database = parseBibTeX(file);                           
                            formatBibTeX(database, file);
                        }catch(ParseException p)
                        {
                            System.out.print("Okunmaya çalışan dosyada hata var ya da boş"); //pop up uyarısı verecek
                        }catch(FileNotFoundException f)
                        {
                            System.out.print("Dosya bulunamadı ya da açılamıyor."); //pop up uyarısı verecek
                        }                   catch (IOException | ObjectResolutionException ex) {
                            Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                      ArrayList values;
                      values = new ArrayList<>();
                        
                        try (Scanner in = new Scanner(file))
                        {
                            String author = in.nextLine();
                            String incollection ="@incollection";
                            
                            while(in.hasNext())
                            {
                                if(author.contains(incollection) == true)
                                {
                                author = in.nextLine(); 
                                values.add(author);
                                
                                String title = in.nextLine();
                                title = title.split("=")[1];
                                values.add(title);
                                
                                String booktitle = in.nextLine();
                                booktitle = booktitle.split("=")[1];
                                values.add(booktitle);
                                
                                String publisher = in.nextLine();
                                publisher = publisher.split("=")[1];  
                                values.add(publisher);
                                
                                String year = in.nextLine();
                                year = year.split("=")[1];
                                values.add(year);
                                
                                String editor = in.nextLine();
                                editor = editor.split("=")[1];
                                values.add(editor);
                                
                                String volume = in.nextLine();
                                volume = volume.split("=")[1];
                                values.add(volume);
                                
                                String series = in.nextLine();
                                series = series.split("=")[1];
                                values.add(series);
                                
                                String chapter = in.nextLine();
                                chapter = chapter.split("=")[1];
                                values.add(chapter);
                                
                                String pages = in.nextLine();
                                pages = pages.split("=")[1];
                                values.add(pages);
                                
                                String address = in.nextLine();
                                address = address.split("=")[1];
                                values.add(address);
                                                               
                                String edition = in.nextLine();
                                edition = edition.split("=")[1];
                                values.add(edition);
                                
                                String month = in.nextLine();
                                month = month.split("=")[1];
                                values.add(month);
                                
                                String note = in.nextLine();
                                values.add(note);
                                return values;              
                                }
                                else
                                {
                                   author = in.nextLine();
                                }                            
                        }        
                 }
        return null;
    }
    

    @SuppressWarnings("empty-statement")
    static ArrayList<String> parsebibArticle(File file) throws FileNotFoundException
    {
        try
                        {
                            BibTeXDatabase database = parseBibTeX(file);
                            
                            formatBibTeX(database, file);
                        }catch(ParseException p)
                        {
                            System.out.print("Okunmaya çalışan dosyada hata var ya da boş"); //pop up uyarısı verecek
                        }catch(FileNotFoundException f)
                        {
                            System.out.print("Dosya bulunamadı ya da açılamıyor."); //pop up uyarısı verecek
                        }                   catch (IOException | ObjectResolutionException ex) {
                            Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                      ArrayList values;
                      values = new ArrayList<>();
                        
                        try (Scanner in = new Scanner(file))
                        {
                            String author = in.nextLine();
                            String article ="@article";

                            while(in.hasNext())
                     {
                                if(author.contains(article))
                        {
    
                            author = in.nextLine();
                            author = author.split("=")[1];
                            values.add(author);

                            
                            String title = in.nextLine(); // ams-subject giriş //
                            title = title.split("=")[1]; 
                            values.add(title);
                            
                            
                            String journal = in.nextLine(); // journal giriş //
                            journal = journal.split("=")[1].trim();
                            values.add(journal);
                            
                            String year = in.nextLine().trim(); //year giriş //  
                            year = year.split("=")[1].trim();
                            values.add(year);
                            
                            String number = in.nextLine().trim(); //year giriş //  
                            number = number.split("=")[1].trim();
                            
                            values.add(number);

                            String pages = in.nextLine().trim(); // pages giriş //   
                            pages = pages.split("=")[1];  
                            values.add(pages);
                            

                            String month = in.nextLine().trim(); // volume giriş //
                            month = month.split("=")[1]; 
                            values.add(month);
                            
                            if(in.nextLine().contains("=") == true)
                            {
                            String volume = in.nextLine().trim();
                            volume = volume.split("=")[1]; 
                            values.add(volume);
                            }
                            return values;
                                }               
                                else
                                {
                                    author = in.nextLine();
                                }                           
                            }    
}
        return null;
    }
    
    /**
     *
     * @param database
     * @param file
     * @throws IOException
     */
    static public void formatBibTeX(BibTeXDatabase database, File file) throws IOException {
		try (Writer writer = file != null ? new FileWriter(file) : new OutputStreamWriter(System.out)) // yeni dosyanın çıktısı 
                {
			BibTeXFormatter formatter = new BibTeXFormatter();

			formatter.format(database, writer);
		}
	}

    /**
     *
     * @param file
     * @return
     * @throws IOException
     * @throws ParseException
     */
    static public BibTeXDatabase parseBibTeX(File file) throws IOException, ParseException 
        {
		 Reader reader = new FileReader(file); 

	         BibTeXParser parser = new BibTeXParser();

			return parser.parse(reader);
		} 
    
    
static public ArrayList<String> replacer(ArrayList<String> list) 
{
    for (int i = 0; i < list.size(); i++) 
    {
          if(list.get(i).contains("{"))
          {  
             String temp = list.get(i);
             temp = temp.replace("{","");
             temp.trim();
             list.set(i, temp);
          }
          
          if(list.get(i).contains("}"))
          {
             String temp = list.get(i);
             temp = temp.replace("}","");
             temp.trim();
             list.set(i, temp);
             
          }
          
          if(list.get(i).contains(","))
          {
             String temp = list.get(i);
             temp = temp.replace(",","");
             temp.trim();
             list.set(i, temp);
          }      
    } 
    return list;
}

    /**
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException
        {
            File file = new File("C:\\Users\\LayThese\\Desktop\\a.bib");
            
            
            System.out.println(replacer(parsebibBook(file)));
            
        }
}
