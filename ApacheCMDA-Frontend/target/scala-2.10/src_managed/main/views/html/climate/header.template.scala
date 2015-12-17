
package views.html.climate

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/*******************************************************************************
* Licensed to the Apache Software Foundation (ASF) under one or more           *
* contributor license agreements.  See the NOTICE file distributed with       *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*                                                                               *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.                                               *
*******************************************************************************/
object header extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /*******************************************************************************
* Licensed to the Apache Software Foundation (ASF) under one or more           *
* contributor license agreements.  See the NOTICE file distributed with       *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*                                                                               *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.                                               *
*******************************************************************************/
    def apply/*18.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*18.4*/("""
<div class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span> <span
                    class="icon-bar"></span> <span class="icon-bar"></span> <span
                    class="icon-bar"></span>
            </button>
            <a class="navbar-brand" style="padding-bottom: 0;" href="/climate"><img
                    src='"""),_display_(Seq[Any](/*29.27*/routes/*29.33*/.Assets.at("images/NASA_JPL_logo.png"))),format.raw/*29.71*/("""'
                    style="height: 40px; width: 220px;">&nbsp&nbsp<img
                    src='"""),_display_(Seq[Any](/*31.27*/routes/*31.33*/.Assets.at("images/logo.png"))),format.raw/*31.62*/("""' style="height: 15px; width: 250px;"></a>
        </div>
        <div class="navbar-collapse collapse" style="height:">
            <ul class="nav navbar-nav navbar-right">

                <li class="dropdown"><a href="#"
                                        class="dropdown-toggle" data-toggle="dropdown">Workflow<b
                        class="caret"></b></a>
                    <ul class="dropdown-menu">

                        <li><a href=""""),_display_(Seq[Any](/*41.39*/routes/*41.45*/.WorkflowController.workflows())),format.raw/*41.76*/("""">Workflow List</a></li>
						<li><a href=""""),_display_(Seq[Any](/*42.21*/routes/*42.27*/.TagController.tagCloud())),format.raw/*42.52*/("""">Tag Cloud</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*43.39*/routes/*43.45*/.TagController.tags())),format.raw/*43.66*/("""">Tag List</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*44.39*/routes/*44.45*/.WorkflowController.createWorkflow())),format.raw/*44.81*/("""">Create Workflow</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*45.39*/routes/*45.45*/.WorkflowController.workflowsByTopViewCount())),format.raw/*45.90*/("""">Workflow Popularity</a></li>
                    </ul>

                </li>


                <li class="dropdown"><a href="#"
                                        class="dropdown-toggle" data-toggle="dropdown">Service<b
                        class="caret"></b></a>
                    <ul class="dropdown-menu">

                        <li><a href=""""),_display_(Seq[Any](/*56.39*/routes/*56.45*/.ClimateServiceController.climateServices())),format.raw/*56.88*/("""">Service List</a></li>
                    </ul>

                </li>
                <li class="dropdown"><a href="#"
                                        class="dropdown-toggle" data-toggle="dropdown">Dataset<b
                        class="caret"></b></a>
                    <ul class="dropdown-menu">

                        <li><a href=""""),_display_(Seq[Any](/*65.39*/routes/*65.45*/.DatasetController.datasetList())),format.raw/*65.77*/("""">Dataset List</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*66.39*/routes/*66.45*/.DatasetController.searchDataset())),format.raw/*66.79*/("""">Search dataset</a></li>
                    </ul>
                </li>
                """),format.raw/*70.52*/("""
                                        """),format.raw/*71.101*/("""
                    """),format.raw/*72.47*/("""
                    """),format.raw/*74.49*/("""
                        """),format.raw/*77.27*/("""
                        """),format.raw/*80.27*/("""
                        """),format.raw/*83.23*/("""
                    """),format.raw/*86.19*/("""

                <li class="dropdown"><a href="#"
                                        class="dropdown-toggle" data-toggle="dropdown">About<b
                        class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href=""""),_display_(Seq[Any](/*92.39*/routes/*92.45*/.ClimateServiceController.home())),format.raw/*92.77*/("""">Home</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*93.39*/routes/*93.45*/.AboutusController.aboutUs())),format.raw/*93.73*/("""">About Us</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*94.39*/routes/*94.45*/.AboutusController.aboutProject())),format.raw/*94.78*/("""">About project</a></li>
                    </ul>
                </li>

                """),_display_(Seq[Any](/*98.18*/if(session.get("userId") == null || session.get("userId").trim.isEmpty)/*98.89*/ {_display_(Seq[Any](format.raw/*98.91*/("""
                    <li class="dropdown"><a href="#"
                    class="dropdown-toggle" data-toggle="dropdown">Sign In / Sign Up<b
                    class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href=""""),_display_(Seq[Any](/*103.43*/routes/*103.49*/.UserController.signInForm)),format.raw/*103.75*/("""">Sign In</a></li>
                            <li><a href=""""),_display_(Seq[Any](/*104.43*/routes/*104.49*/.UserController.signUpForm)),format.raw/*104.75*/("""">Sign Up</a></li>
                        </ul>
                    </li>
                """)))}/*107.18*/else/*107.22*/{_display_(Seq[Any](format.raw/*107.23*/("""
                    <li class="dropdown"><a href="#"
                    class="dropdown-toggle" data-toggle="dropdown">My Profile<b
                    class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href=""""),_display_(Seq[Any](/*112.43*/routes/*112.49*/.UserController.profile)),format.raw/*112.72*/("""">Profile</a></li>
                            """),_display_(Seq[Any](/*113.30*/if(session.get("userId").equals("112"))/*113.69*/ {_display_(Seq[Any](format.raw/*113.71*/("""
                                <li><a href=""""),_display_(Seq[Any](/*114.47*/routes/*114.53*/.UserController.allUsers)),format.raw/*114.77*/("""">All Users</a></li>
                            """)))})),format.raw/*115.30*/("""
                            <li><a href=""""),_display_(Seq[Any](/*116.43*/routes/*116.49*/.UserController.showFriends)),format.raw/*116.76*/("""">Friends</a></li>
                            <li><a href=""""),_display_(Seq[Any](/*117.43*/routes/*117.49*/.UserController.showSubscriptions)),format.raw/*117.82*/("""">Subscriptions</a></li>
                            <li><a href=""""),_display_(Seq[Any](/*118.43*/routes/*118.49*/.UserGroupController.showGroups)),format.raw/*118.80*/("""">User Groups</a></li>
                            <li><a href=""""),_display_(Seq[Any](/*119.43*/routes/*119.49*/.UserController.signOut)),format.raw/*119.72*/("""">Sign Out</a></li>
                        </ul>
                    </li>
                """)))})),format.raw/*122.18*/("""


            </ul>
        </div>
        <!--/.nav-collapse -->
    </div>
</div>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 11 08:39:51 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/header.scala.html
                    HASH: 460e1931f20ead04aa501ddea828a3d3e6fde16f
                    MATRIX: 3339->1288|3435->1290|4066->1885|4081->1891|4141->1929|4276->2028|4291->2034|4342->2063|4833->2518|4848->2524|4901->2555|4982->2600|4997->2606|5044->2631|5139->2690|5154->2696|5197->2717|5291->2775|5306->2781|5364->2817|5465->2882|5480->2888|5547->2933|5944->3294|5959->3300|6024->3343|6412->3695|6427->3701|6481->3733|6579->3795|6594->3801|6650->3835|6768->3979|6838->4080|6887->4127|6936->4199|6989->4367|7042->4540|7095->4616|7144->4680|7458->4958|7473->4964|7527->4996|7617->5050|7632->5056|7682->5084|7776->5142|7791->5148|7846->5181|7973->5272|8053->5343|8093->5345|8407->5622|8423->5628|8472->5654|8570->5715|8586->5721|8635->5747|8747->5839|8761->5843|8801->5844|9108->6114|9124->6120|9170->6143|9255->6191|9304->6230|9345->6232|9429->6279|9445->6285|9492->6309|9575->6359|9655->6402|9671->6408|9721->6435|9819->6496|9835->6502|9891->6535|9995->6602|10011->6608|10065->6639|10167->6704|10183->6710|10229->6733|10355->6826
                    LINES: 56->18|59->18|70->29|70->29|70->29|72->31|72->31|72->31|82->41|82->41|82->41|83->42|83->42|83->42|84->43|84->43|84->43|85->44|85->44|85->44|86->45|86->45|86->45|97->56|97->56|97->56|106->65|106->65|106->65|107->66|107->66|107->66|110->70|111->71|112->72|113->74|114->77|115->80|116->83|117->86|123->92|123->92|123->92|124->93|124->93|124->93|125->94|125->94|125->94|129->98|129->98|129->98|134->103|134->103|134->103|135->104|135->104|135->104|138->107|138->107|138->107|143->112|143->112|143->112|144->113|144->113|144->113|145->114|145->114|145->114|146->115|147->116|147->116|147->116|148->117|148->117|148->117|149->118|149->118|149->118|150->119|150->119|150->119|153->122
                    -- GENERATED --
                */
            