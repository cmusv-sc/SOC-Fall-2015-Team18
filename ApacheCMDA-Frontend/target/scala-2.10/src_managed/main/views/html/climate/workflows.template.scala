
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
* Licensed to the Apache Software Foundation (ASF) under one or more		   *
* contributor license agreements.  See the NOTICE file distributed with	   *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*																			   *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.											   *
*******************************************************************************/
object workflows extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[metadata.Workflow],play.data.Form[metadata.Workflow],play.api.templates.HtmlFormat.Appendable] {

    /*******************************************************************************
* Licensed to the Apache Software Foundation (ASF) under one or more		   *
* contributor license agreements.  See the NOTICE file distributed with	   *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*																			   *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.											   *
*******************************************************************************/
    def apply/*18.2*/(workflows: List[metadata.Workflow], workflowForm: play.data.Form[metadata.Workflow]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
<script src='"""),_display_(Seq[Any](/*23.15*/routes/*23.21*/.Assets.at("javascripts/edit_button.js"))),format.raw/*23.61*/("""'></script>
<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*25.30*/("""{"""),format.raw/*25.31*/("""

	"""),format.raw/*27.2*/("""}"""),format.raw/*27.3*/(""");
	</script>
""")))};
Seq[Any](format.raw/*18.87*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("Workflows", scripts)/*31.28*/ {_display_(Seq[Any](format.raw/*31.30*/("""

"""),_display_(Seq[Any](/*33.2*/flash_message())),format.raw/*33.17*/("""

<h1>"""),_display_(Seq[Any](/*35.6*/workflows/*35.15*/.size())),format.raw/*35.22*/(""" Workflow List</h1>
<table class="table table-striped table-bordered table-condensed ex2 tablesorter" id = "csTable">
    <thead>
    <tr>
        <th class="col-md-2">Workflow ID</td>
        <th class="col-md-4">Workflow title</td>
        <th class="clo-md-4">Workflow Description</th>

    </tr>
    </thead>
    """),_display_(Seq[Any](/*45.6*/for(workflow <- workflows) yield /*45.32*/{_display_(Seq[Any](format.raw/*45.33*/("""
    <tr>
        <td><a href = """"),_display_(Seq[Any](/*47.25*/routes/*47.31*/.WorkflowController.displayWorkflow(workflow.getId()))),format.raw/*47.84*/(""""><font size="3">"""),_display_(Seq[Any](/*47.102*/workflow/*47.110*/.getId())),format.raw/*47.118*/("""</a></font></td>

        <td><a href = """"),_display_(Seq[Any](/*49.25*/routes/*49.31*/.WorkflowController.displayWorkflow(workflow.getId()))),format.raw/*49.84*/(""""><font size="3">"""),_display_(Seq[Any](/*49.102*/workflow/*49.110*/.getTitle())),format.raw/*49.121*/("""</a></font></td>

        <td><span class=""""),_display_(Seq[Any](/*51.27*/workflow/*51.35*/.getDescription())),format.raw/*51.52*/(""" editable"  data-name='purpose'><font size="3">
            """),_display_(Seq[Any](/*52.14*/workflow/*52.22*/.getDescription())),format.raw/*52.39*/(""" </font></span></td>

    </tr>
    """)))})),format.raw/*55.6*/("""
</table>

<!--div style="clear: both;" align="center">

    <input class="btn" type="submit" value="Add Comments">

    <div class="pi">
        <div>
            <h5 class="alignleft"><a href>User user1</a></h5>
            <h5 class="alignright">Posted on Time</h5>
        </div>
        <div class="pcommenttext" style="clear: both;" align="left">
            <p class="fontnewroman">Comments</p>
        </div>
        <div class="pcomment">
            <h5 class="alignleft">Replies</h5>

            <div class="pcontent" style="clear: both;" >
                <div>
                    <h5 class="alignleft"><a href>User user1</a></h5>
                    <h5 class="alignright">Posted on Time</h5>
                </div>
                <div class="pcommenttext" style="clear: both;" align="left">
                    <p class="fontnewroman">Comments</p>
                </div>
            </div>

            <input class="btn" type="submit" value="Reply">

        </div>
    </div>

</div-->


<!--div class="newsbox">
    <div class="newsbox_header">
        <h2>UserName</h2>
        <strong>Time1</strong>
        <div class="clearthis"></div>
    </div>
    <div class="newsbox_content">
        <p>Testing Content</p>
        <dl>
            <dt>
                Replies
            </dt>
            <dd>
                Comments
            </dd>
        </dl>
    </div>

</div-->

""")))})),format.raw/*111.2*/("""
"""))}
    }
    
    def render(workflows:List[metadata.Workflow],workflowForm:play.data.Form[metadata.Workflow]): play.api.templates.HtmlFormat.Appendable = apply(workflows,workflowForm)
    
    def f:((List[metadata.Workflow],play.data.Form[metadata.Workflow]) => play.api.templates.HtmlFormat.Appendable) = (workflows,workflowForm) => apply(workflows,workflowForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 04 23:00:02 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/workflows.scala.html
                    HASH: 643c71325d2428303ead3d6341f660d47e55d052
                    MATRIX: 3202->1189|3381->1295|3396->1302|3481->1306|3532->1321|3547->1327|3609->1367|3710->1440|3739->1441|3769->1444|3797->1445|3852->1274|3881->1293|3909->1460|3947->1463|3982->1489|4022->1491|4060->1494|4097->1509|4139->1516|4157->1525|4186->1532|4539->1850|4581->1876|4620->1877|4690->1911|4705->1917|4780->1970|4835->1988|4853->1996|4884->2004|4962->2046|4977->2052|5052->2105|5107->2123|5125->2131|5159->2142|5239->2186|5256->2194|5295->2211|5392->2272|5409->2280|5448->2297|5516->2334|6953->3739
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|78->35|78->35|78->35|88->45|88->45|88->45|90->47|90->47|90->47|90->47|90->47|90->47|92->49|92->49|92->49|92->49|92->49|92->49|94->51|94->51|94->51|95->52|95->52|95->52|98->55|154->111
                    -- GENERATED --
                */
            