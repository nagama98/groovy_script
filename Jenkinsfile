
def code

node {
 stage('Checkout') {
  git 'https://github.com/saurabhkyatam/apitest.git'
 }

 stage('Load') {
   code = load 'apicallgetalljob.groovy'
    println code
 }
   stage('excute')
   {
       def token =code.getToken()
       code.getJob(token)
   }
 
}