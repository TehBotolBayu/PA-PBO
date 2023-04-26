/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import org.json.JSONObject;

public class api {
    String asal, tujuan;
    double nominal;
    api(String asal, String tujuan, double nominal){
        this.asal = asal;
        this.tujuan = tujuan;
        this.nominal =  nominal;
    }
    public double konversi() {
        try {
            String apiKey = "6VdDcgXCOcnjxYwHMKWeTgw6qTdWGC6XopOqm3zW";
            // Encode query parameters
            String encodedApiKey = URLEncoder.encode(apiKey, "UTF-8");
            String encodedCurrencies = URLEncoder.encode(this.tujuan, "UTF-8");
            String encodedBaseCurrency = URLEncoder.encode(this.asal, "UTF-8");
            
            // Construct the URL with the encoded query parameters
            String urlStr = "https://api.currencyapi.com/v3/latest?apikey=" + encodedApiKey + "&currencies=" + encodedCurrencies + "&base_currency=" + encodedBaseCurrency;

            URL url = new URL(urlStr);

            // Create a connection object and set the request method to GET
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            // Read the response from the API
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Print the response from the API
            //System.out.println(response.toString());
            
            JSONObject jsonObj = new JSONObject(response.toString());
            JSONObject data =  jsonObj.getJSONObject("data");
            JSONObject value = data.getJSONObject(this.tujuan);
            System.out.print(value.toString());
            double v = value.getFloat("value");
            double hasil = this.nominal * v;
            return hasil;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
