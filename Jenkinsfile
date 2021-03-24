
def code

node {
 stage('Checkout') {
  git 'https://github.com/nagama98/groovy_script.git'
 }

 stage('Load') {
   code = load 'post.groovy'
    println code
 }
   /*stage('excute')
   {
       def token =code.getToken()
       code.getJob(token)
   }*/
 
}