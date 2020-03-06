/**
 * Campus Incident API Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package fil.eservices.campusincident.data;

import android.util.Log;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import fil.eservices.campusincident.data.model.*;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        try {
          return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").parse(json.getAsString().replaceAll("Z$", "+0000"));
        } catch (ParseException e) {
          e.printStackTrace();
        }
        return null;
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Geolocation".equalsIgnoreCase(className)) {
      return new TypeToken<List<Geolocation>>(){}.getType();
    }
    
    if ("Incident".equalsIgnoreCase(className)) {
      return new TypeToken<List<Incident>>(){}.getType();
    }
    
    if ("IncidentDto".equalsIgnoreCase(className)) {
      return new TypeToken<List<IncidentDto>>(){}.getType();
    }
    
    if ("Location".equalsIgnoreCase(className)) {
      return new TypeToken<List<Location>>(){}.getType();
    }
    
    if ("ModelAndView".equalsIgnoreCase(className)) {
      return new TypeToken<List<ModelAndView>>(){}.getType();
    }
    
    if ("View".equalsIgnoreCase(className)) {
      return new TypeToken<List<View>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Geolocation".equalsIgnoreCase(className)) {
      return new TypeToken<Geolocation>(){}.getType();
    }
    
    if ("Incident".equalsIgnoreCase(className)) {
      return new TypeToken<Incident>(){}.getType();
    }
    
    if ("IncidentDto".equalsIgnoreCase(className)) {
      return new TypeToken<IncidentDto>(){}.getType();
    }
    
    if ("Location".equalsIgnoreCase(className)) {
      return new TypeToken<Location>(){}.getType();
    }
    
    if ("ModelAndView".equalsIgnoreCase(className)) {
      return new TypeToken<ModelAndView>(){}.getType();
    }
    
    if ("View".equalsIgnoreCase(className)) {
      return new TypeToken<View>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};