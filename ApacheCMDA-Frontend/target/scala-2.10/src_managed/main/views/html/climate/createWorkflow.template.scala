
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
object createWorkflow extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[metadata.Workflow],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(workflowForm: play.data.Form[metadata.Workflow]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*21.2*/scripts/*21.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.13*/("""
<script src='"""),_display_(Seq[Any](/*22.15*/routes/*22.21*/.Assets.at("javascripts/edit_button.js"))),format.raw/*22.61*/("""'></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
""")))};
Seq[Any](format.raw/*18.51*/("""
"""),format.raw/*20.1*/("""
"""),format.raw/*26.2*/("""

"""),_display_(Seq[Any](/*28.2*/main("Workflow", scripts)/*28.27*/ {_display_(Seq[Any](format.raw/*28.29*/("""

"""),_display_(Seq[Any](/*30.2*/flash_message())),format.raw/*30.17*/("""

<h1 style="margin-left:490px">Create a Workflow</h1>
"""),_display_(Seq[Any](/*33.2*/helper/*33.8*/.form(action=routes.WorkflowController.handleCreateWorkflow(), 'enctype -> "multipart/form-data")/*33.105*/ {_display_(Seq[Any](format.raw/*33.107*/("""
<div class="ui-widget col-sm-offset-3 col-sm-7">
    <div class="form-group">
        """),_display_(Seq[Any](/*36.10*/inputText(
        workflowForm("Title"),
        'class -> "form-control",
        'size->70,
        '_label -> "Workflow Title"
        ))),format.raw/*41.10*/("""
    </div>
    <div class="form-group">
        """),_display_(Seq[Any](/*44.10*/inputText(
        workflowForm("Description"),
        'class -> "form-control",
        'size->70,
        '_label -> "Workflow Description"
        ))),format.raw/*49.10*/("""
    </div>
    <div class="form-group">
        """),_display_(Seq[Any](/*52.10*/inputFile(
        workflowForm("Image"),
        'class -> "form-control",
        'size->70,
        '_label -> "Workflow Image"
        ))),format.raw/*57.10*/("""
    </div>
    <div class="form-group">
        """),_display_(Seq[Any](/*60.10*/inputText(
        workflowForm("Contributor"),
        'class -> "form-control",
        'size->70,
        '_label -> "Workflow Contributor"
        ))),format.raw/*65.10*/("""
    </div>
    <div class="form-group">
        """),_display_(Seq[Any](/*68.10*/inputText(
        workflowForm("Instruction"),
        'class -> "form-control",
        'size->70,
        '_label -> "Workflow Instruction"
        ))),format.raw/*73.10*/("""
    </div>
    <div class="form-group">
        """),_display_(Seq[Any](/*76.10*/inputText(
        workflowForm("Dataset"),
        'class -> "form-control",
        'size->70,
        '_label -> "Workflow Dataset"
        ))),format.raw/*81.10*/("""
    </div>
    <div>
        """),_display_(Seq[Any](/*84.10*/inputText(
        workflowForm("tags"),
        'class -> "form-control",
        'size->70,
        '_label -> "Workflow tags(split by ',')"
        ))),format.raw/*89.10*/("""
    </div>


    <div id="show" style="display: none;">
        <textarea style="width: 640px" rows="4" id="content"></textarea>
    </div>

    <div align="center">
        <input class="btn" type="submit" value="Create Workflow">
        <a href=""""),_display_(Seq[Any](/*99.19*/routes/*99.25*/.WorkflowController.workflows())),format.raw/*99.56*/("""" class="btn">Cancel</a>
    </div>
</div>
""")))})),format.raw/*102.2*/("""


<br>

""")))})),format.raw/*107.2*/("""

"""))}
    }
    
    def render(workflowForm:play.data.Form[metadata.Workflow]): play.api.templates.HtmlFormat.Appendable = apply(workflowForm)
    
    def f:((play.data.Form[metadata.Workflow]) => play.api.templates.HtmlFormat.Appendable) = (workflowForm) => apply(workflowForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 11 08:39:51 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/createWorkflow.scala.html
                    HASH: 6dffc888eb66160cfa18de7e5b9342e8d2149809
                    MATRIX: 3381->1288|3524->1357|3539->1364|3624->1368|3675->1383|3690->1389|3752->1429|4020->1337|4048->1355|4076->1657|4114->1660|4148->1685|4188->1687|4226->1690|4263->1705|4354->1761|4368->1767|4475->1864|4516->1866|4640->1954|4802->2094|4888->2144|5062->2296|5148->2346|5310->2486|5396->2536|5570->2688|5656->2738|5830->2890|5916->2940|6082->3084|6149->3115|6323->3267|6610->3518|6625->3524|6678->3555|6754->3599|6796->3609
                    LINES: 56->18|59->21|59->21|61->21|62->22|62->22|62->22|67->18|68->20|69->26|71->28|71->28|71->28|73->30|73->30|76->33|76->33|76->33|76->33|79->36|84->41|87->44|92->49|95->52|100->57|103->60|108->65|111->68|116->73|119->76|124->81|127->84|132->89|142->99|142->99|142->99|145->102|150->107
                    -- GENERATED --
                */
            