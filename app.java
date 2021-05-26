import java.io.IOException; 
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
 public class app{ 
private static final String Zillow_Florida_Listings_Url="https://www.zillow.com/floria/homes";
    private static final String Housing_Title_Class="";
    private static final String  Housing_Title="";
    private static final String Housing_Link_Select="";
    private static final String  Housing_Price="";

    class real_estate{
        private String listingName;
        private String listingLink;
        private String listingPrice;

        public String get_name()
        { 
            return listingName;
        }
        
        public void set_name(String listingName)
        {
            this.listingName=listingName;
        }
        public String  get_Link()
        {
            return listingLink;
        }
        
        public void set_link(String listingLink)
        {
            this.listingLink=listingLink;
        }
        public String get_listing_price()
        {
            return listingPrice;
        }
        public void set_listing_price(String listingPrice)
        {
            this.listingPrice=listingPrice;
        }

    }
    //create array method in order to store and manipulate info.
    public List <Product>get_Housing(){
    List<Product>products= new ArrayList<>();
    Document doc;
   ///try catch block to allow runtime exeception. 
       try{    
doc=Jsoup.connect(Zillow_Florida_Listings_Url).get();
    }catch (IOException e)
    {
        throw new RuntimeException(e);
    }

    }

    Elements productElements = doc.getElementsByClass(Housing_Title_Class);
     for (Element productElement:productElements)
        {
        Product product = new Product ();
         Elements titleElement =productElements.gethousingByClass(Housing_Title_Class);
         if(!housingTitle.isEmpty())
         {
             housing.set_name(housingTitle.get(0).attr("title"));
         }
         Elements linkElements=housingElement.select(Housing_Link_Select);
        if(!linkElements.isEmpty())
        {
            housing.set_link(linkElements.get(0).attr("href"));
        }
        Elements housingpriceElements=housingElement.select(Housing_Price);
        if(!housingpriceElements.isEmpty())
        {
            housing.set_listing_price(priceElements.get(0).text());
        }
         
        }
housing.add(house);
 }


return housing;
}

    public static void main(String[] args)
    {

    }
}
}
}

    
