// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/CJ/Desktop/8391/CS_7340_Lab3/Frontend/conf/routes
// @DATE:Tue Oct 26 16:59:55 CDT 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_1: controllers.HomeController,
  // @LINE:35
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_1: controllers.HomeController,
    // @LINE:35
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lda""", """controllers.HomeController.lda()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ldaHandler""", """controllers.HomeController.ldaHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topics""", """controllers.HomeController.topics()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topicsHandler""", """controllers.HomeController.topicsHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic0""", """controllers.HomeController.topic0()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic0Handler""", """controllers.HomeController.topic0Handler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic1""", """controllers.HomeController.topic1()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic1Handler""", """controllers.HomeController.topic1Handler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic2""", """controllers.HomeController.topic2()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic2Handler""", """controllers.HomeController.topic2Handler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic3""", """controllers.HomeController.topic3()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic3Handler""", """controllers.HomeController.topic3Handler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic4""", """controllers.HomeController.topic4()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic4Handler""", """controllers.HomeController.topic4Handler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic5""", """controllers.HomeController.topic5()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic5Handler""", """controllers.HomeController.topic5Handler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic6""", """controllers.HomeController.topic6()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic6Handler""", """controllers.HomeController.topic6Handler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic7""", """controllers.HomeController.topic7()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic7Handler""", """controllers.HomeController.topic7Handler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic8""", """controllers.HomeController.topic8()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic8Handler""", """controllers.HomeController.topic8Handler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic9""", """controllers.HomeController.topic9()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic9Handler""", """controllers.HomeController.topic9Handler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_lda1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lda")))
  )
  private[this] lazy val controllers_HomeController_lda1_invoker = createInvoker(
    HomeController_1.lda(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "lda",
      Nil,
      "GET",
      this.prefix + """lda""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_ldaHandler2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ldaHandler")))
  )
  private[this] lazy val controllers_HomeController_ldaHandler2_invoker = createInvoker(
    HomeController_1.ldaHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "ldaHandler",
      Nil,
      "GET",
      this.prefix + """ldaHandler""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_topics3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topics")))
  )
  private[this] lazy val controllers_HomeController_topics3_invoker = createInvoker(
    HomeController_1.topics(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topics",
      Nil,
      "GET",
      this.prefix + """topics""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_topicsHandler4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topicsHandler")))
  )
  private[this] lazy val controllers_HomeController_topicsHandler4_invoker = createInvoker(
    HomeController_1.topicsHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topicsHandler",
      Nil,
      "GET",
      this.prefix + """topicsHandler""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_topic05_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic0")))
  )
  private[this] lazy val controllers_HomeController_topic05_invoker = createInvoker(
    HomeController_1.topic0(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topic0",
      Nil,
      "GET",
      this.prefix + """topic0""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_topic0Handler6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic0Handler")))
  )
  private[this] lazy val controllers_HomeController_topic0Handler6_invoker = createInvoker(
    HomeController_1.topic0Handler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topic0Handler",
      Nil,
      "GET",
      this.prefix + """topic0Handler""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_topic17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic1")))
  )
  private[this] lazy val controllers_HomeController_topic17_invoker = createInvoker(
    HomeController_1.topic1(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topic1",
      Nil,
      "GET",
      this.prefix + """topic1""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_topic1Handler8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic1Handler")))
  )
  private[this] lazy val controllers_HomeController_topic1Handler8_invoker = createInvoker(
    HomeController_1.topic1Handler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topic1Handler",
      Nil,
      "GET",
      this.prefix + """topic1Handler""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_topic29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic2")))
  )
  private[this] lazy val controllers_HomeController_topic29_invoker = createInvoker(
    HomeController_1.topic2(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topic2",
      Nil,
      "GET",
      this.prefix + """topic2""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_topic2Handler10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic2Handler")))
  )
  private[this] lazy val controllers_HomeController_topic2Handler10_invoker = createInvoker(
    HomeController_1.topic2Handler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topic2Handler",
      Nil,
      "GET",
      this.prefix + """topic2Handler""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_topic311_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic3")))
  )
  private[this] lazy val controllers_HomeController_topic311_invoker = createInvoker(
    HomeController_1.topic3(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topic3",
      Nil,
      "GET",
      this.prefix + """topic3""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_topic3Handler12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic3Handler")))
  )
  private[this] lazy val controllers_HomeController_topic3Handler12_invoker = createInvoker(
    HomeController_1.topic3Handler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topic3Handler",
      Nil,
      "GET",
      this.prefix + """topic3Handler""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_topic413_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic4")))
  )
  private[this] lazy val controllers_HomeController_topic413_invoker = createInvoker(
    HomeController_1.topic4(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topic4",
      Nil,
      "GET",
      this.prefix + """topic4""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_topic4Handler14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic4Handler")))
  )
  private[this] lazy val controllers_HomeController_topic4Handler14_invoker = createInvoker(
    HomeController_1.topic4Handler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topic4Handler",
      Nil,
      "GET",
      this.prefix + """topic4Handler""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_topic515_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic5")))
  )
  private[this] lazy val controllers_HomeController_topic515_invoker = createInvoker(
    HomeController_1.topic5(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topic5",
      Nil,
      "GET",
      this.prefix + """topic5""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_topic5Handler16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic5Handler")))
  )
  private[this] lazy val controllers_HomeController_topic5Handler16_invoker = createInvoker(
    HomeController_1.topic5Handler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topic5Handler",
      Nil,
      "GET",
      this.prefix + """topic5Handler""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_topic617_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic6")))
  )
  private[this] lazy val controllers_HomeController_topic617_invoker = createInvoker(
    HomeController_1.topic6(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topic6",
      Nil,
      "GET",
      this.prefix + """topic6""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_topic6Handler18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic6Handler")))
  )
  private[this] lazy val controllers_HomeController_topic6Handler18_invoker = createInvoker(
    HomeController_1.topic6Handler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topic6Handler",
      Nil,
      "GET",
      this.prefix + """topic6Handler""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_topic719_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic7")))
  )
  private[this] lazy val controllers_HomeController_topic719_invoker = createInvoker(
    HomeController_1.topic7(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topic7",
      Nil,
      "GET",
      this.prefix + """topic7""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_topic7Handler20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic7Handler")))
  )
  private[this] lazy val controllers_HomeController_topic7Handler20_invoker = createInvoker(
    HomeController_1.topic7Handler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topic7Handler",
      Nil,
      "GET",
      this.prefix + """topic7Handler""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_HomeController_topic821_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic8")))
  )
  private[this] lazy val controllers_HomeController_topic821_invoker = createInvoker(
    HomeController_1.topic8(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topic8",
      Nil,
      "GET",
      this.prefix + """topic8""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_HomeController_topic8Handler22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic8Handler")))
  )
  private[this] lazy val controllers_HomeController_topic8Handler22_invoker = createInvoker(
    HomeController_1.topic8Handler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topic8Handler",
      Nil,
      "GET",
      this.prefix + """topic8Handler""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_HomeController_topic923_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic9")))
  )
  private[this] lazy val controllers_HomeController_topic923_invoker = createInvoker(
    HomeController_1.topic9(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topic9",
      Nil,
      "GET",
      this.prefix + """topic9""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_HomeController_topic9Handler24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic9Handler")))
  )
  private[this] lazy val controllers_HomeController_topic9Handler24_invoker = createInvoker(
    HomeController_1.topic9Handler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topic9Handler",
      Nil,
      "GET",
      this.prefix + """topic9Handler""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Assets_at25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at25_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index())
      }
  
    // @LINE:8
    case controllers_HomeController_lda1_route(params@_) =>
      call { 
        controllers_HomeController_lda1_invoker.call(HomeController_1.lda())
      }
  
    // @LINE:9
    case controllers_HomeController_ldaHandler2_route(params@_) =>
      call { 
        controllers_HomeController_ldaHandler2_invoker.call(HomeController_1.ldaHandler())
      }
  
    // @LINE:10
    case controllers_HomeController_topics3_route(params@_) =>
      call { 
        controllers_HomeController_topics3_invoker.call(HomeController_1.topics())
      }
  
    // @LINE:11
    case controllers_HomeController_topicsHandler4_route(params@_) =>
      call { 
        controllers_HomeController_topicsHandler4_invoker.call(HomeController_1.topicsHandler())
      }
  
    // @LINE:12
    case controllers_HomeController_topic05_route(params@_) =>
      call { 
        controllers_HomeController_topic05_invoker.call(HomeController_1.topic0())
      }
  
    // @LINE:13
    case controllers_HomeController_topic0Handler6_route(params@_) =>
      call { 
        controllers_HomeController_topic0Handler6_invoker.call(HomeController_1.topic0Handler())
      }
  
    // @LINE:14
    case controllers_HomeController_topic17_route(params@_) =>
      call { 
        controllers_HomeController_topic17_invoker.call(HomeController_1.topic1())
      }
  
    // @LINE:15
    case controllers_HomeController_topic1Handler8_route(params@_) =>
      call { 
        controllers_HomeController_topic1Handler8_invoker.call(HomeController_1.topic1Handler())
      }
  
    // @LINE:16
    case controllers_HomeController_topic29_route(params@_) =>
      call { 
        controllers_HomeController_topic29_invoker.call(HomeController_1.topic2())
      }
  
    // @LINE:17
    case controllers_HomeController_topic2Handler10_route(params@_) =>
      call { 
        controllers_HomeController_topic2Handler10_invoker.call(HomeController_1.topic2Handler())
      }
  
    // @LINE:18
    case controllers_HomeController_topic311_route(params@_) =>
      call { 
        controllers_HomeController_topic311_invoker.call(HomeController_1.topic3())
      }
  
    // @LINE:19
    case controllers_HomeController_topic3Handler12_route(params@_) =>
      call { 
        controllers_HomeController_topic3Handler12_invoker.call(HomeController_1.topic3Handler())
      }
  
    // @LINE:20
    case controllers_HomeController_topic413_route(params@_) =>
      call { 
        controllers_HomeController_topic413_invoker.call(HomeController_1.topic4())
      }
  
    // @LINE:21
    case controllers_HomeController_topic4Handler14_route(params@_) =>
      call { 
        controllers_HomeController_topic4Handler14_invoker.call(HomeController_1.topic4Handler())
      }
  
    // @LINE:22
    case controllers_HomeController_topic515_route(params@_) =>
      call { 
        controllers_HomeController_topic515_invoker.call(HomeController_1.topic5())
      }
  
    // @LINE:23
    case controllers_HomeController_topic5Handler16_route(params@_) =>
      call { 
        controllers_HomeController_topic5Handler16_invoker.call(HomeController_1.topic5Handler())
      }
  
    // @LINE:24
    case controllers_HomeController_topic617_route(params@_) =>
      call { 
        controllers_HomeController_topic617_invoker.call(HomeController_1.topic6())
      }
  
    // @LINE:25
    case controllers_HomeController_topic6Handler18_route(params@_) =>
      call { 
        controllers_HomeController_topic6Handler18_invoker.call(HomeController_1.topic6Handler())
      }
  
    // @LINE:26
    case controllers_HomeController_topic719_route(params@_) =>
      call { 
        controllers_HomeController_topic719_invoker.call(HomeController_1.topic7())
      }
  
    // @LINE:27
    case controllers_HomeController_topic7Handler20_route(params@_) =>
      call { 
        controllers_HomeController_topic7Handler20_invoker.call(HomeController_1.topic7Handler())
      }
  
    // @LINE:28
    case controllers_HomeController_topic821_route(params@_) =>
      call { 
        controllers_HomeController_topic821_invoker.call(HomeController_1.topic8())
      }
  
    // @LINE:29
    case controllers_HomeController_topic8Handler22_route(params@_) =>
      call { 
        controllers_HomeController_topic8Handler22_invoker.call(HomeController_1.topic8Handler())
      }
  
    // @LINE:30
    case controllers_HomeController_topic923_route(params@_) =>
      call { 
        controllers_HomeController_topic923_invoker.call(HomeController_1.topic9())
      }
  
    // @LINE:31
    case controllers_HomeController_topic9Handler24_route(params@_) =>
      call { 
        controllers_HomeController_topic9Handler24_invoker.call(HomeController_1.topic9Handler())
      }
  
    // @LINE:35
    case controllers_Assets_at25_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at25_invoker.call(Assets_0.at(path, file))
      }
  }
}
