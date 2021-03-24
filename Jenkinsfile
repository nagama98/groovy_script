
def code

node {
 stage('Checkout') {
  git 'https://github.com/nagama98/groovy_script.git'
 }

 stage('post') {
sh 'groovy post.groovy'
 }
 stage('post') {
sh 'groovy get.groovy'
 }
   /*stage('excute')
   {
       def token =code.getToken()
       code.getJob(token)
   }*/
 
}