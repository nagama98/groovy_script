@Grab(group='org.apache.httpcomponents', module='httpclient', version='4.5.2')
//@Grab('org.apache.httpcomponents:httpclient:4.2.1')
import org.apache.http.impl.client.DefaultHttpClient
import org.apache.http.client.methods.HttpGet

import groovy.json.*

import groovy.json.JsonBuilder.*
import org.apache.http.client.methods.*
import org.apache.http.entity.*
import org.apache.http.impl.client.*

def select
def top

def httpClient = new DefaultHttpClient()

def Geturl = "https://drlglobal.sharepoint.com/sites/HybridArch/DevSecOps/_api/web/lists/getbytitle('Configuration')/items?$select=*&$top=100"
def get=new HttpGet(Geturl)
get.addHeader("Accept","application/json;odata=nometadata")
get.addHeader("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Im5PbzNaRHJPRFhFSzFqS1doWHNsSFJfS1hFZyIsImtpZCI6Im5PbzNaRHJPRFhFSzFqS1doWHNsSFJfS1hFZyJ9.eyJhdWQiOiIwMDAwMDAwMy0wMDAwLTBmZjEtY2UwMC0wMDAwMDAwMDAwMDAvZHJsZ2xvYmFsLnNoYXJlcG9pbnQuY29tQDZkMTQ2ODJiLTY4YTYtNGEyNS1hZjNkLTA2NjE1ZTE0NmIxZSIsImlzcyI6IjAwMDAwMDAxLTAwMDAtMDAwMC1jMDAwLTAwMDAwMDAwMDAwMEA2ZDE0NjgyYi02OGE2LTRhMjUtYWYzZC0wNjYxNWUxNDZiMWUiLCJpYXQiOjE2MTY0MjA5MDMsIm5iZiI6MTYxNjQyMDkwMywiZXhwIjoxNjE2NTA3NjAzLCJpZGVudGl0eXByb3ZpZGVyIjoiMDAwMDAwMDEtMDAwMC0wMDAwLWMwMDAtMDAwMDAwMDAwMDAwQDZkMTQ2ODJiLTY4YTYtNGEyNS1hZjNkLTA2NjE1ZTE0NmIxZSIsIm5hbWVpZCI6ImIzMzdmOTY0LTYzMjItNDY3NS1iNTQ1LWIzMGJjZTcxMzdjZkA2ZDE0NjgyYi02OGE2LTRhMjUtYWYzZC0wNjYxNWUxNDZiMWUiLCJvaWQiOiI5ZGZjZGM4NC0zNGE5LTRhMGQtYTdkNS0yYmQ5NjE1YWM0YjgiLCJzdWIiOiI5ZGZjZGM4NC0zNGE5LTRhMGQtYTdkNS0yYmQ5NjE1YWM0YjgiLCJ0cnVzdGVkZm9yZGVsZWdhdGlvbiI6ImZhbHNlIn0.bAn-ImmISpK7M82WD6O1kemduTGeb4HhCp7e8ljZsc9HHKmrCCePKMYQDqnmIxKVUzByDIUaJVfAXJvLtW_NPru9A7jY0pdE_13cGwaprOxoC9TN16l5Fy8nsSkxBQX_YGCpJtCNfNVXVK8W1xho97Jo8yLXdE7qTPWgsTAMWUI68nWJKTXCIgS2K0Kaopt8JL9SLM4reK3vsb5FQ-DquFuCCyGb7jKwUj4dUlyFMgj4vI81uiD8w7UWx1ILsRbBOkWE50zznVO2AW_u9d9VfuoPKCCKtStTb2wAW89sZKTMW3m3da8jaipO-f8w1ZTt4FxCIFugl0KDfDzVi4I2MQ")
def client = HttpClientBuilder.create().build()
def response = client.execute(get)

def bufferedReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()))
def jsonResponse = bufferedReader.getText()
println "response: \n" + jsonResponse

