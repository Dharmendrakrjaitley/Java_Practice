package solidPrinciples;

import java.awt.RenderingHints.Key;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/*
 * Steps for URL Shortening:

    Generate a unique ID for each long URL.
    Encode the unique ID to generate a short URL using base62 encoding.
    Store the long URL and short URL mapping in a database.
    If the user accesses the short URL, decode it and retrieve the original long URL.
 * */

public class TinyUrlService {
	
	private static final String BASE_HOST="http://tiny.url/";
	private static final String BASE62="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private static final int BASE=BASE62.length();
	
	private Map<String,String> UrlToKeyMap=new HashMap<String,String>();
	private Map<String,String> KeyToUrlMap=new HashMap<String,String>();
	private long counter=1;
	
	//Generate ShortURL from LongURL
	public String shortenUrl(String longUrl)
	{
		if(UrlToKeyMap.containsKey(longUrl))
			return BASE_HOST + UrlToKeyMap.get(longUrl);
		else
		{
			String shortKey=encode(counter++);
			KeyToUrlMap.put(shortKey, longUrl);
			UrlToKeyMap.put(longUrl, shortKey);
			return BASE_HOST + shortKey;
		}
	}
	
	// Get LongUrl from shortUrl
	
	public String getOriginalUrl(String shortUrl)
	{
		String shortKey=shortUrl.replace(BASE_HOST, "");
		if(KeyToUrlMap.containsKey(shortKey))
		{
			return KeyToUrlMap.get(shortKey);
		}
		return null;
	}
	
	private String encode(long id) {
		StringBuilder result=new StringBuilder();
		while(id>0)
		{
			char temp=BASE62.charAt((int)id % BASE);
			result.append(temp);
			id/=BASE;
		}
		return result.reverse().toString();
	}
	
	private long decode(String shortKey)
	{
		int id=0;
		for(char ch:shortKey.toCharArray())
		{
			int index=BASE62.indexOf(ch);
			id=id*BASE + index;
		}
		return id;
	}

	public static void main(String[] args) {
		TinyUrlService service=new TinyUrlService();
		String longUrl1 = "https://www.example.com/some/very/long/url";
        String shortUrl1 = service.shortenUrl(longUrl1);
        System.out.println("Shortened URL: " + shortUrl1);
        String returnedLongUrl=service.getOriginalUrl(shortUrl1);
        System.out.println(returnedLongUrl);

	}

}
