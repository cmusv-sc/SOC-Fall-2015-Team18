
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
object linkTags extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,play.data.Form[metadata.Tag],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(workflowId:String, tagForm: play.data.Form[metadata.Tag]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*21.2*/scripts/*21.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.13*/("""
<script src='"""),_display_(Seq[Any](/*22.15*/routes/*22.21*/.Assets.at("javascripts/edit_button.js"))),format.raw/*22.61*/("""'></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
""")))};
Seq[Any](format.raw/*18.60*/("""
"""),format.raw/*20.1*/("""
"""),format.raw/*26.2*/("""

"""),_display_(Seq[Any](/*28.2*/main("Link Tags", scripts)/*28.28*/ {_display_(Seq[Any](format.raw/*28.30*/("""

"""),_display_(Seq[Any](/*30.2*/flash_message())),format.raw/*30.17*/("""

<h1 style="margin-left:490px">Link tags</h1>
"""),_display_(Seq[Any](/*33.2*/helper/*33.8*/.form(routes.WorkflowController.linkTags())/*33.51*/ {_display_(Seq[Any](format.raw/*33.53*/("""
<div class="ui-widget col-sm-offset-3 col-sm-7">

    <div class="form-group" style="display:none;">
        """),_display_(Seq[Any](/*37.10*/inputText(
        tagForm("workflowId").copy(value=Some(workflowId)),
        'class -> "form-control",
        'size->70,
        '_label -> "Tags(separated by ',')"
        ))),format.raw/*42.10*/("""
    </div>

    <div class="form-group">
        """),_display_(Seq[Any](/*46.10*/inputText(
        tagForm("tags"),
        'class -> "form-control",
        'size->70,
        '_label -> "Tags(separated by ',')"
        ))),format.raw/*51.10*/("""
    </div>

    <div id="show" style="display: none;">
        <textarea style="width: 640px" rows="4" id="content"></textarea>
    </div>

    <div align="center">
        <input class="btn" type="submit" value="Link Tags">
    </div>
</div>
""")))})),format.raw/*62.2*/("""


<br>

""")))})),format.raw/*67.2*/("""

"""))}
    }
    
    def render(workflowId:String,tagForm:play.data.Form[metadata.Tag]): play.api.templates.HtmlFormat.Appendable = apply(workflowId,tagForm)
    
    def f:((String,play.data.Form[metadata.Tag]) => play.api.templates.HtmlFormat.Appendable) = (workflowId,tagForm) => apply(workflowId,tagForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 11 08:39:51 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/linkTags.scala.html
                    HASH: 5dc5597b1c6db27267a8c7902d6890bf3378aa6c
                    MATRIX: 3377->1288|3529->1366|3544->1373|3629->1377|3680->1392|3695->1398|3757->1438|4025->1346|4053->1364|4081->1666|4119->1669|4154->1695|4194->1697|4232->1700|4269->1715|4352->1763|4366->1769|4418->1812|4458->1814|4605->1925|4804->2102|4891->2153|5055->2295|5331->2540|5372->2550
                    LINES: 56->18|59->21|59->21|61->21|62->22|62->22|62->22|67->18|68->20|69->26|71->28|71->28|71->28|73->30|73->30|76->33|76->33|76->33|76->33|80->37|85->42|89->46|94->51|105->62|110->67
                    -- GENERATED --
                */
            