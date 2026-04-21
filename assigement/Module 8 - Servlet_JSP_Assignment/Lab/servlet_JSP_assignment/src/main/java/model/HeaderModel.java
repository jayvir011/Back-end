package model;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * Model class to handle Logic for HTTP Headers retrieval.
 */
public class HeaderModel {
    
    // logic to extract headers from the request object
    public Map<String, String> extractHeaders(HttpServletRequest request) {
        Map<String, String> headermap = new HashMap<>();
        Enumeration<String> headerNames = request.getHeaderNames();
        
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            String value = request.getHeader(name);
            headermap.put(name, value);
        }
        return headermap;
    }
}
