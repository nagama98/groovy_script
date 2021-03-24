//@Grab(group='org.apache.httpcomponents', module='httpclient', version='4.5.2')

import groovy.json.*

import groovy.json.JsonBuilder.*
import org.apache.http.client.methods.*
import org.apache.http.entity.*
import org.apache.http.impl.client.*
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;

List<NameValuePair> data = new ArrayList<NameValuePair>(1);
            data.add(new BasicNameValuePair("grant_type", "client_credentials"));
            data.add(new BasicNameValuePair("client_id", "b337f964-6322-4675-b545-b30bce7137cf@6d14682b-68a6-4a25-af3d-06615e146b1e"));
            data.add(new BasicNameValuePair("client_secret", "p+DLdqlYRWdECdoqT9xaULTknfA/zQ2tSSbh4q5kqnE="));
            data.add(new BasicNameValuePair("resource","00000003-0000-0ff1-ce00-000000000000/drlglobal.sharepoint.com@6d14682b-68a6-4a25-af3d-06615e146b1e "));
 

def url = "https://accounts.accesscontrol.windows.net/6d14682b-68a6-4a25-af3d-06615e146b1e/tokens/OAuth/2"
def post = new HttpPost(url)

post.addHeader("content-type", "application/x-www-form-urlencoded")
post.addHeader("cookies", "esctx-AQABAAAAAAD--DLA3VO7QrddgJg7Wevr6jLbx-K3QoF6aYQz67SaWeowC13UCOIXlrztvGCSN1hqE5s5xqg7qFuRPxjfP7_tkMB_Ab7HibK6yFlB--dRtL9B2VFup13yocSnr86_TJSEFAryhhoR1DhlHMn7fPKb9zhi1i7rjad6oIo60BVSu9ZX1vBi7xbPuvR3gbrRVnIgAA")

post.setEntity(new UrlEncodedFormEntity(data))

def client = HttpClientBuilder.create().build()
def response = client.execute(post)

def bufferedReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()))
//def jsonResponse = bufferedReader.getText()

def slurper = new JsonSlurper()
def resultMap = slurper.parseText(bufferedReader.getText())

def token_type=resultMap.token_type
println "token type: " +token_type

def expires_in=resultMap.expires_in
println "expires in: " +expires_in

def expires_on=resultMap.expires_on
println "expires on: " +expires_on

def resource=resultMap.resource
println "resource: " +resource


def access_token=resultMap.access_token
println "access token: " + access_token

//assert "client-credential" == resultMap["grant-type"]
//assert resultMap["client-id"] != null

