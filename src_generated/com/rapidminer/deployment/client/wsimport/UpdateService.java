
package com.rapidminer.deployment.client.wsimport;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "UpdateService", targetNamespace = "http://ws.update.deployment.rapid_i.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UpdateService {


    /**
     * 
     * @param targetPlatform
     * @param packageId
     * @param version
     * @return
     *     returns java.lang.String
     * @throws UpdateServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDownloadURL", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetDownloadURL")
    @ResponseWrapper(localName = "getDownloadURLResponse", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetDownloadURLResponse")
    public String getDownloadURL(
        @WebParam(name = "packageId", targetNamespace = "")
        String packageId,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "targetPlatform", targetNamespace = "")
        String targetPlatform)
        throws UpdateServiceException_Exception
    ;

    /**
     * 
     * @param licenseName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLicenseText", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetLicenseText")
    @ResponseWrapper(localName = "getLicenseTextResponse", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetLicenseTextResponse")
    public String getLicenseText(
        @WebParam(name = "licenseName", targetNamespace = "")
        String licenseName);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMirrors", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetMirrors")
    @ResponseWrapper(localName = "getMirrorsResponse", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetMirrorsResponse")
    public List<String> getMirrors();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMessageOfTheDay", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetMessageOfTheDay")
    @ResponseWrapper(localName = "getMessageOfTheDayResponse", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetMessageOfTheDayResponse")
    public String getMessageOfTheDay();

    /**
     * 
     * @param forPrefix
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRapidMinerExtensionForOperatorPrefix", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetRapidMinerExtensionForOperatorPrefix")
    @ResponseWrapper(localName = "getRapidMinerExtensionForOperatorPrefixResponse", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetRapidMinerExtensionForOperatorPrefixResponse")
    public String getRapidMinerExtensionForOperatorPrefix(
        @WebParam(name = "forPrefix", targetNamespace = "")
        String forPrefix);

    /**
     * 
     * @param basePackage
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getExtensions", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetExtensions")
    @ResponseWrapper(localName = "getExtensionsResponse", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetExtensionsResponse")
    public List<String> getExtensions(
        @WebParam(name = "basePackage", targetNamespace = "")
        String basePackage);

    /**
     * 
     * @param since
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "anyUpdatesSince", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.AnyUpdatesSince")
    @ResponseWrapper(localName = "anyUpdatesSinceResponse", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.AnyUpdatesSinceResponse")
    public boolean anyUpdatesSince(
        @WebParam(name = "since", targetNamespace = "")
        XMLGregorianCalendar since);

    /**
     * 
     * @param searchString
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchFor", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.SearchFor")
    @ResponseWrapper(localName = "searchForResponse", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.SearchForResponse")
    public List<String> searchFor(
        @WebParam(name = "searchString", targetNamespace = "")
        String searchString);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTopRated", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetTopRated")
    @ResponseWrapper(localName = "getTopRatedResponse", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetTopRatedResponse")
    public List<String> getTopRated();

    /**
     * 
     * @param targetPlatform
     * @param packageId
     * @return
     *     returns java.lang.String
     * @throws UpdateServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLatestVersion", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetLatestVersion")
    @ResponseWrapper(localName = "getLatestVersionResponse", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetLatestVersionResponse")
    public String getLatestVersion(
        @WebParam(name = "packageId", targetNamespace = "")
        String packageId,
        @WebParam(name = "targetPlatform", targetNamespace = "")
        String targetPlatform)
        throws UpdateServiceException_Exception
    ;

    /**
     * 
     * @param licenseName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLicenseTextHtml", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetLicenseTextHtml")
    @ResponseWrapper(localName = "getLicenseTextHtmlResponse", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetLicenseTextHtmlResponse")
    public String getLicenseTextHtml(
        @WebParam(name = "licenseName", targetNamespace = "")
        String licenseName);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTopDownloads", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetTopDownloads")
    @ResponseWrapper(localName = "getTopDownloadsResponse", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetTopDownloadsResponse")
    public List<String> getTopDownloads();

    /**
     * 
     * @param targetPlatform
     * @param packageId
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAvailableVersions", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetAvailableVersions")
    @ResponseWrapper(localName = "getAvailableVersionsResponse", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetAvailableVersionsResponse")
    public List<String> getAvailableVersions(
        @WebParam(name = "packageId", targetNamespace = "")
        String packageId,
        @WebParam(name = "targetPlatform", targetNamespace = "")
        String targetPlatform);

    /**
     * 
     * @param targetPlatform
     * @param packageId
     * @param version
     * @return
     *     returns com.rapidminer.deployment.client.wsimport.PackageDescriptor
     * @throws UpdateServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPackageInfo", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetPackageInfo")
    @ResponseWrapper(localName = "getPackageInfoResponse", targetNamespace = "http://ws.update.deployment.rapid_i.com/", className = "com.rapidminer.deployment.client.wsimport.GetPackageInfoResponse")
    public PackageDescriptor getPackageInfo(
        @WebParam(name = "packageId", targetNamespace = "")
        String packageId,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "targetPlatform", targetNamespace = "")
        String targetPlatform)
        throws UpdateServiceException_Exception
    ;

}
