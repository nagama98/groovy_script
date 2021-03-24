@Grab(group='org.apache.httpcomponents', module='httpclient', version='4.5.2')
import groovy.json.*

import groovy.json.JsonBuilder.*
import org.apache.http.client.methods.*
import org.apache.http.entity.*
import org.apache.http.impl.client.*
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;

class post{
static def get_token(){
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
}
static void main(String[] args) {
      get_token();
   } 
}

    @Grab(group='org.apache.httpcomponents', module='httpclient', version='4.5.2')
    //@Grab('org.apache.httpcomponents:httpclient:4.2.1')
    import org.apache.http.impl.client.DefaultHttpClient
    import org.apache.http.client.methods.HttpGet

    import groovy.json.*

    import groovy.json.JsonBuilder.*
    import org.apache.http.client.methods.*
    import org.apache.http.entity.*
    import org.apache.http.impl.client.*
class get{
    static def getmethod(){
    def select
    def top

    def httpClient = new DefaultHttpClient()

    def Geturl = "https://drlglobal.sharepoint.com/sites/HybridArch/DevSecOps/_api/web/lists/getbytitle('Configuration')/items?$select=*&$top=100"
    def get=new HttpGet(Geturl)
    get.addHeader("Accept","application/json;odata=nometadata")
    get.addHeader("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Im5PbzNaRHJPRFhFSzFqS1doWHNsSFJfS1hFZyIsImtpZCI6Im5PbzNaRHJPRFhFSzFqS1doWHNsSFJfS1hFZyJ9.eyJhdWQiOiIwMDAwMDAwMy0wMDAwLTBmZjEtY2UwMC0wMDAwMDAwMDAwMDAvZHJsZ2xvYmFsLnNoYXJlcG9pbnQuY29tQDZkMTQ2ODJiLTY4YTYtNGEyNS1hZjNkLTA2NjE1ZTE0NmIxZSIsImlzcyI6IjAwMDAwMDAxLTAwMDAtMDAwMC1jMDAwLTAwMDAwMDAwMDAwMEA2ZDE0NjgyYi02OGE2LTRhMjUtYWYzZC0wNjYxNWUxNDZiMWUiLCJpYXQiOjE2MTY1NjEwNjksIm5iZiI6MTYxNjU2MTA2OSwiZXhwIjoxNjE2NjQ3NzY5LCJpZGVudGl0eXByb3ZpZGVyIjoiMDAwMDAwMDEtMDAwMC0wMDAwLWMwMDAtMDAwMDAwMDAwMDAwQDZkMTQ2ODJiLTY4YTYtNGEyNS1hZjNkLTA2NjE1ZTE0NmIxZSIsIm5hbWVpZCI6ImIzMzdmOTY0LTYzMjItNDY3NS1iNTQ1LWIzMGJjZTcxMzdjZkA2ZDE0NjgyYi02OGE2LTRhMjUtYWYzZC0wNjYxNWUxNDZiMWUiLCJvaWQiOiI5ZGZjZGM4NC0zNGE5LTRhMGQtYTdkNS0yYmQ5NjE1YWM0YjgiLCJzdWIiOiI5ZGZjZGM4NC0zNGE5LTRhMGQtYTdkNS0yYmQ5NjE1YWM0YjgiLCJ0cnVzdGVkZm9yZGVsZWdhdGlvbiI6ImZhbHNlIn0.Lu5vfjZE1gqKI5RxxmzVaWi8JlsfDBXnpfNjFvot2dohvFYHw0AnZ_9iTSyo-_zgqtuZk5ZTjaIVWubAG64qD5uhV3LQfbkprUxaXlRXGPykq22EUy3xOTf8qipLAqyK8voWUy3KGhxv6_MyttXGbwV8yp5lhPkt267LkDh4CVyiaVKyiq9qcCTr_dJvyi-qQDAaPtb0NymagRPRTXXZZc0HwyjIRNHldTDkm1HrgZVMUdHDYwtZf__WBAODAcWinDXB1Jv4IIPrn1UJlvk6xUBn_TefQo5ars7AU9OADfSEhDfTd2sGICYRq3EKHHOXZbzjjWpelcxFrsTDSjbL_Q")
    def client = HttpClientBuilder.create().build()
    def response = client.execute(get)

    def bufferedReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()))
    def jsonResponse = bufferedReader.getText()
    println "response: \n" + jsonResponse

    }
    static void main(String[] args) {
      getmethod();
   } 
}
