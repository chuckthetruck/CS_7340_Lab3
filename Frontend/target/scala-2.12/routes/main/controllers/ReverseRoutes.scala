// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/CJ/Desktop/8391/CS_7340_Lab3/Frontend/conf/routes
// @DATE:Tue Oct 26 16:59:55 CDT 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def topic1(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topic1")
    }
  
    // @LINE:27
    def topic7Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topic7Handler")
    }
  
    // @LINE:11
    def topicsHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topicsHandler")
    }
  
    // @LINE:31
    def topic9Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topic9Handler")
    }
  
    // @LINE:23
    def topic5Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topic5Handler")
    }
  
    // @LINE:26
    def topic7(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topic7")
    }
  
    // @LINE:15
    def topic1Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topic1Handler")
    }
  
    // @LINE:18
    def topic3(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topic3")
    }
  
    // @LINE:16
    def topic2(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topic2")
    }
  
    // @LINE:13
    def topic0Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topic0Handler")
    }
  
    // @LINE:24
    def topic6(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topic6")
    }
  
    // @LINE:29
    def topic8Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topic8Handler")
    }
  
    // @LINE:8
    def lda(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "lda")
    }
  
    // @LINE:30
    def topic9(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topic9")
    }
  
    // @LINE:21
    def topic4Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topic4Handler")
    }
  
    // @LINE:9
    def ldaHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ldaHandler")
    }
  
    // @LINE:20
    def topic4(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topic4")
    }
  
    // @LINE:10
    def topics(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topics")
    }
  
    // @LINE:12
    def topic0(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topic0")
    }
  
    // @LINE:28
    def topic8(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topic8")
    }
  
    // @LINE:22
    def topic5(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topic5")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:25
    def topic6Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topic6Handler")
    }
  
    // @LINE:19
    def topic3Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topic3Handler")
    }
  
    // @LINE:17
    def topic2Handler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topic2Handler")
    }
  
  }

  // @LINE:35
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
