
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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fayılridır
{
 
    @SuppressWarnings("empty-statement")
    static void parsebib(File file) throws FileNotFoundException
    {
        try
                        {
                            BibTeXDatabase database = parseBibTeX(file);
                            
                            formatBibTeX(database, file);
                        }catch(ParseException p)
                        {
                            System.out.print("Okunmaya çalışan dosyada hata var ya da boş");
                        }catch(FileNotFoundException f)
                        {
                            System.out.print("Dosya bulunamadı ya da açılamıyor.");
                        }                   catch (IOException | ObjectResolutionException ex) {
                            Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        
                        try (Scanner in = new Scanner(file))
                        {
                            String author = in.nextLine();
                            String identifier ="@article";
                            
      
                            while(!(author.contains(identifier)))
                            {
                                if(in.hasNext())
                                {
                                    author = in.nextLine();
                                }
                                
                                else
                                {
                                    System.out.println("Dosya okunamadı ya da boş");
                                    break;
                                }
                                
                            }
                             
                            author = author.split("@author")[0];

                            author = in.nextLine();
                            String value = author.split("=")[1];
                            value = value.split("\\}")[0];
                            value = value.split("\\{")[1];
                            
                            
                            System.out.println(value.split("\\,")[1].trim()); // author adı veritabanına yazılacak //
                            System.out.println(value.split("\\,")[0].trim()); // author soyadı  veritabanına yazılacak //
                            
                            String amssubject = in.nextLine(); // ams-subject giriş //
                            String amssubject2;
                            
                            amssubject2 = amssubject.split("=")[1];
                            amssubject2 = amssubject2.split("\\}")[0].trim();
                            
                            String cevap = amssubject2.split("\\{")[1].trim().substring(amssubject2.split("\\{")[1].trim().indexOf("(")+1,amssubject2.split("\\{")[1].trim().indexOf(")"));
                            System.out.println(cevap);
                            
                            String journal = in.nextLine(); // journal giriş //
                            String journal2;
                            
                            journal2 = journal.split("=")[1].trim();
                            
                            journal2 = journal2.split("\\}")[0].trim();
                            
                            
                            System.out.println(journal2.split("\\{")[1].trim());   // journal veritabanına yazılacak //
                            
                            
                            String review = in.nextLine(); // review giriş //
                            String review2;
                            
                            review2 = review.split("=")[1].trim();
                            review2 = review2.split("\\}")[0].trim();
                            
                            
                            System.out.println(review2.split("\\{")[1].trim()); // review veri tabanına yazılacak //
                            
                            
                            String pages = in.nextLine(); // pages giriş //
                            String pages2;
                            
                            pages2 = pages.split("=")[1].trim();
                            pages2 = pages2.split("\\}")[0].trim();
                            pages2 = pages2.split("\\{")[1].trim();
                            
                            System.out.println(pages2.split("\\--")[0]); // aralığın ilk sayfası //
                            System.out.println(pages2.split("\\--")[1]); // aralığın ikinci sayfası //
                            
                            String title = in.nextLine(); // title giriş //
                            String title2;
                            
                            
                            title2 = title.split("=")[1].trim();
                            title2 = title2.split(",")[0].trim();
                            
                            
                            String cevap2 = title2.substring(title2.indexOf("{")+2,title2.indexOf("}"));
                            
                            System.out.println(cevap2); // title veritabanına yazılacak //
                            
                            
                            String volume = in.nextLine(); // volume giriş //
                            String volume2;
                            
                            volume2 = volume.split("=")[1].trim();
                            volume2 = volume2.split(",")[0].trim();
                            
                            String cevap3 = volume2.substring(volume2.indexOf("{")+1,volume2.indexOf("}"));
                            
                            System.out.println(cevap3); // volume veri tabanına yazılacak //
                            
                            
                            String year = in.nextLine(); // volume giriş //
                            String year2;
                            
                            year2 = year.split("=")[1].trim();
                            
                            String cevap4 =  year2.substring(year2.indexOf("{")+1, year2.indexOf("}"));
                            
                            System.out.println(cevap4); // year veri tabanına yazılacak
                         }
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

    private static boolean isContains(String source, String subItem)
    {
         String pattern = "\\b"+ subItem +"\\b";
         Pattern p=Pattern.compile(pattern);
         Matcher m=p.matcher(source);
         return m.find();
    }
        
    /**
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException
        {
            File file = new File("C:\\Users\\LayThese\\Desktop\\sample.bib");
            parsebib(file);
        }
}
	


