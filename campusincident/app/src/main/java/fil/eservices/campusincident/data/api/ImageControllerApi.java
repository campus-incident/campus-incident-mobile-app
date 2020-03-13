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

package fil.eservices.campusincident.data.api;

import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import fil.eservices.campusincident.data.ApiException;
import fil.eservices.campusincident.data.ApiInvoker;
import fil.eservices.campusincident.data.Pair;
import fil.eservices.campusincident.data.model.ImageSaved;
import fil.eservices.campusincident.data.model.Location;

public class ImageControllerApi {
  String basePath = "http://54.38.242.184:8080";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
   * handleFileUpload
   *
   * @param file file
   * @return ImageSaved
   */
  public ImageSaved handleFileUploadUsingPOST (File file) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'file' is set
    if (file == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'file' when calling handleFileUploadUsingPOST",
              new ApiException(400, "Missing the required parameter 'file' when calling handleFileUploadUsingPOST"));
    }

    // create path and map variables
    String path = "/images";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
            "multipart/form-data"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      if (file != null) {
        localVarBuilder.addBinaryBody("file", file);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
        return (ImageSaved) ApiInvoker.deserialize(localVarResponse, "", ImageSaved.class);
      } else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    } catch (InterruptedException ex) {
      throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

  /**
   * handleFileUpload
   *
   * @param file file
   */
  public void handleFileUploadUsingPOST (File file, final Response.Listener<ImageSaved> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'file' is set
    if (file == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'file' when calling handleFileUploadUsingPOST",
              new ApiException(400, "Missing the required parameter 'file' when calling handleFileUploadUsingPOST"));
    }

    // create path and map variables
    String path = "/images".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
            "multipart/form-data"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      localVarBuilder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);

      if (file != null) {
        localVarBuilder.addBinaryBody("file", file);
      }

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params

    }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
              new Response.Listener<String>() {
                @Override
                public void onResponse(String localVarResponse) {
                  try {
                    responseListener.onResponse((ImageSaved) ApiInvoker.deserialize(localVarResponse,  "", ImageSaved.class));
                  } catch (ApiException exception) {
                    errorListener.onErrorResponse(new VolleyError(exception));
                  }
                }
              }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                  errorListener.onErrorResponse(error);
                }
              });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
   * serveFile
   *
   * @param imageId imageId
   * @return byte[]
   */
  public byte[] serveFileUsingGET (Long imageId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'imageId' is set
    if (imageId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'imageId' when calling serveFileUsingGET",
              new ApiException(400, "Missing the required parameter 'imageId' when calling serveFileUsingGET"));
    }

    // create path and map variables
    String path = "/images/{imageId}".replaceAll("\\{" + "imageId" + "\\}", apiInvoker.escapeString(imageId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
        return (byte[]) ApiInvoker.deserialize(localVarResponse, "", byte[].class);
      } else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    } catch (InterruptedException ex) {
      throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

  /**
   * serveFile
   *
   * @param imageId imageId
   */
  public void serveFileUsingGET (Long imageId, final Response.Listener<byte[]> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'imageId' is set
    if (imageId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'imageId' when calling serveFileUsingGET",
              new ApiException(400, "Missing the required parameter 'imageId' when calling serveFileUsingGET"));
    }

    // create path and map variables
    String path = "/images/{imageId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "imageId" + "\\}", apiInvoker.escapeString(imageId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {

    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();


      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
              new Response.Listener<String>() {
                @Override
                public void onResponse(String localVarResponse) {
                  try {
                    responseListener.onResponse((byte[]) ApiInvoker.deserialize(localVarResponse,  "", byte[].class));
                  } catch (ApiException exception) {
                    errorListener.onErrorResponse(new VolleyError(exception));
                  }
                }
              }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                  errorListener.onErrorResponse(error);
                }
              });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}