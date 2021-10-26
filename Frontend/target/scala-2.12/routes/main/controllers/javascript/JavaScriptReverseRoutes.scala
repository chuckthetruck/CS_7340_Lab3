// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/CJ/Desktop/8391/CS_7340_Lab3/Frontend/conf/routes
// @DATE:Tue Oct 26 16:59:55 CDT 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def topic1: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topic1",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic1"})
        }
      """
    )
  
    // @LINE:27
    def topic7Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topic7Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic7Handler"})
        }
      """
    )
  
    // @LINE:11
    def topicsHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topicsHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topicsHandler"})
        }
      """
    )
  
    // @LINE:31
    def topic9Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topic9Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic9Handler"})
        }
      """
    )
  
    // @LINE:23
    def topic5Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topic5Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic5Handler"})
        }
      """
    )
  
    // @LINE:26
    def topic7: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topic7",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic7"})
        }
      """
    )
  
    // @LINE:15
    def topic1Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topic1Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic1Handler"})
        }
      """
    )
  
    // @LINE:18
    def topic3: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topic3",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic3"})
        }
      """
    )
  
    // @LINE:16
    def topic2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topic2",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic2"})
        }
      """
    )
  
    // @LINE:13
    def topic0Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topic0Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic0Handler"})
        }
      """
    )
  
    // @LINE:24
    def topic6: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topic6",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic6"})
        }
      """
    )
  
    // @LINE:29
    def topic8Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topic8Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic8Handler"})
        }
      """
    )
  
    // @LINE:8
    def lda: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.lda",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lda"})
        }
      """
    )
  
    // @LINE:30
    def topic9: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topic9",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic9"})
        }
      """
    )
  
    // @LINE:21
    def topic4Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topic4Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic4Handler"})
        }
      """
    )
  
    // @LINE:9
    def ldaHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.ldaHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ldaHandler"})
        }
      """
    )
  
    // @LINE:20
    def topic4: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topic4",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic4"})
        }
      """
    )
  
    // @LINE:10
    def topics: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topics",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topics"})
        }
      """
    )
  
    // @LINE:12
    def topic0: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topic0",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic0"})
        }
      """
    )
  
    // @LINE:28
    def topic8: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topic8",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic8"})
        }
      """
    )
  
    // @LINE:22
    def topic5: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topic5",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic5"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:25
    def topic6Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topic6Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic6Handler"})
        }
      """
    )
  
    // @LINE:19
    def topic3Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topic3Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic3Handler"})
        }
      """
    )
  
    // @LINE:17
    def topic2Handler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topic2Handler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic2Handler"})
        }
      """
    )
  
  }

  // @LINE:35
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
