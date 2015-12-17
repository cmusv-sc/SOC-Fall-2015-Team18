
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
/**/
object workflowDisplay extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[metadata.Workflow,play.data.Form[metadata.Comment],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(workflow: metadata.Workflow, commentForm: play.data.Form[metadata.Comment],tags:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*6.2*/scripts/*6.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.13*/("""
<script src='"""),_display_(Seq[Any](/*7.15*/routes/*7.21*/.Assets.at("javascripts/edit_button.js"))),format.raw/*7.61*/("""'></script>
<script type="text/javascript">
          $(document).ready(function()"""),format.raw/*9.39*/("""{"""),format.raw/*9.40*/("""

          """),format.raw/*11.11*/("""}"""),format.raw/*11.12*/(""");
  </script>
""")))};
Seq[Any](format.raw/*1.90*/("""


"""),format.raw/*5.1*/("""
"""),format.raw/*13.2*/("""

"""),_display_(Seq[Any](/*15.2*/main("Workflows", scripts)/*15.28*/ {_display_(Seq[Any](format.raw/*15.30*/("""

"""),_display_(Seq[Any](/*17.2*/flash_message())),format.raw/*17.17*/("""


    <div class="container">


        <body>

            <h2 class="text-center">Workflow Details</h2>

            <div class="container col-md-6">
                <form>
                    <table class="table table-bordered table-striped">
                        <thead>
                            <tr>
                                <th class="col-md-2">Item</th>
                                <th class="col-md-4">Value</th>

                            </tr>
                        </thead>
                        <tbody id="dynamicTBody">

                            <tr id="Title_trID">
                                <td id="Title">Workflow Title</td>
                                <td><span type="text" class="form-control"
                                id="Title_detail">"""),_display_(Seq[Any](/*42.52*/workflow/*42.60*/.getTitle())),format.raw/*42.71*/("""</td>
                            </tr>
                            <tr id="Description_trID">
                                <td id="Description">Workflow Description</td>
                                <td><span type="text" class="form-control"
                                id="Description_detail">"""),_display_(Seq[Any](/*47.58*/workflow/*47.66*/.getDescription())),format.raw/*47.83*/("""</td>
                            </tr>
                            <tr id="Contributor_trID">
                                <td id="Contributor">Workflow Contributor</td>
                                <td><span type="text" class="form-control"
                                id="Contributor_detail">"""),_display_(Seq[Any](/*52.58*/workflow/*52.66*/.getContributor())),format.raw/*52.83*/("""</td>
                            </tr>
                            <tr id="Instruction_trID">
                                <td id="Instruction">Workflow Instruction</td>
                                <td><span type="text" class="form-control"
                                id="Instruction_detail">"""),_display_(Seq[Any](/*57.58*/workflow/*57.66*/.getInstruction())),format.raw/*57.83*/("""</td>
                            </tr>
                            <tr id="Dataset_trID">
                                <td id="Dataset">Workflow Dataset</td>
                                <td><span type="text" class="form-control"
                                id="Dataset_detail">"""),_display_(Seq[Any](/*62.54*/workflow/*62.62*/.getDataset())),format.raw/*62.75*/("""</td>
                            </tr>

                            <tr id="Tags_trID">
                                <td id="Tags">Workflow tags</td>
                                <td><span type="text" class="form-control"
                                          id="Tags_detail">"""),_display_(Seq[Any](/*68.61*/tags)),format.raw/*68.65*/("""</td>
                            </tr>

                        </tbody>
                    </table>
                </form>
            </div>


            <div class="container col-md-6">
                <form>
                    <table class="table table-bordered table-striped">
                        <thead>
                            <tr>
                                <th>Workflow Image</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><a id="workflowImgLink" href=""> <img src=""""),_display_(Seq[Any](/*87.81*/workflow/*87.89*/.getImage())),format.raw/*87.100*/(""""
                                id="workflowImg" class="img-responsive">
                                </a></td>
                            </tr>
                        </tbody>
                    </table>
                    <br>
                    <div class="text-center" id="output"></div>
                </form>
            </div>

            <div style="clear: both;" align="center">
                """),_display_(Seq[Any](/*99.18*/if(workflow.visibility == 1)/*99.46*/ {_display_(Seq[Any](format.raw/*99.48*/("""
                    """),_display_(Seq[Any](/*100.22*/helper/*100.28*/.form(routes.WorkflowController.addLevelComment(workflow.getId()))/*100.94*/ {_display_(Seq[Any](format.raw/*100.96*/("""
                        <div class = "form-group" id="commentForm">
                        """),_display_(Seq[Any](/*102.26*/textarea(commentForm("Comment on workflow"), 'rows -> 3, 'style -> "width: 80%;"))),format.raw/*102.107*/("""
                        </div>
                        <input class="btn" type="submit" value="Add Comments">
                    """)))})),format.raw/*105.22*/("""
                """)))})),format.raw/*106.18*/("""
                """),_display_(Seq[Any](/*107.18*/for(level <- workflow.getLevelList()) yield /*107.55*/{_display_(Seq[Any](format.raw/*107.56*/("""
                    <div class="pi">
                        <div>
                            <h5 class="alignleft"><a href = """"),_display_(Seq[Any](/*110.63*/{routes.UserController.oneUser(level.comment.userId)})),format.raw/*110.116*/("""">User """),_display_(Seq[Any](/*110.124*/level/*110.129*/.comment.userName)),format.raw/*110.146*/("""</a></h5>
                            <h5 class="alignright">Posted on """),_display_(Seq[Any](/*111.63*/level/*111.68*/.comment.date.toString())),format.raw/*111.92*/("""</h5>
                        </div>
                        <div class="pcommenttext" style="clear: both;" align="left">
                            <p class="fontnewroman">"""),_display_(Seq[Any](/*114.54*/level/*114.59*/.comment.comments)),format.raw/*114.76*/("""</p>
                        </div>
                        <div class="pcomment">
                            """),_display_(Seq[Any](/*117.30*/if(level.commentList.size()>0)/*117.60*/ {_display_(Seq[Any](format.raw/*117.62*/("""
                                <h5 class="alignleft">Replies</h5>
                            """)))})),format.raw/*119.30*/("""
                            """),_display_(Seq[Any](/*120.30*/for(eachComment <- level.commentList) yield /*120.67*/{_display_(Seq[Any](format.raw/*120.68*/("""
                                <div class="pcontent" style="clear: both;">
                                    <div>
                                        <h5 class="alignleft"><a href = """"),_display_(Seq[Any](/*123.75*/{routes.UserController.oneUser(eachComment.userId)})),format.raw/*123.126*/("""">User """),_display_(Seq[Any](/*123.134*/eachComment/*123.145*/.userName)),format.raw/*123.154*/("""</a></h5>
                                        <h5 class="alignright">Posted on """),_display_(Seq[Any](/*124.75*/eachComment/*124.86*/.date.toString())),format.raw/*124.102*/("""</h5>
                                    </div>
                                    <div class="pcommenttext" style="clear: both;" align="left">
                                        <p class="fontnewroman">"""),_display_(Seq[Any](/*127.66*/eachComment/*127.77*/.comments)),format.raw/*127.86*/("""</p>
                                    </div>
                                </div>
                            """)))})),format.raw/*130.30*/("""
                            """),_display_(Seq[Any](/*131.30*/if(workflow.visibility == 1)/*131.58*/ {_display_(Seq[Any](format.raw/*131.60*/("""
                                """),_display_(Seq[Any](/*132.34*/helper/*132.40*/.form(routes.WorkflowController.addSingleComment(workflow.getId(), level.id))/*132.117*/ {_display_(Seq[Any](format.raw/*132.119*/("""
                                    <div class = "form-group">
                                    """),_display_(Seq[Any](/*134.38*/textarea(commentForm("Reply on this comment"), 'rows -> 3, 'style -> "width: 80%;"))),format.raw/*134.121*/("""
                                    </div>
                                    <input class="btn" type="submit" value="Reply">
                                    """)))})),format.raw/*137.38*/("""
                            """)))})),format.raw/*138.30*/("""
                        </div>
                    </div>
                """)))})),format.raw/*141.18*/("""
            </div>

        </body>

    </div>

    """),format.raw/*167.15*/("""







    """),format.raw/*283.11*/("""


""")))})))}
    }
    
    def render(workflow:metadata.Workflow,commentForm:play.data.Form[metadata.Comment],tags:String): play.api.templates.HtmlFormat.Appendable = apply(workflow,commentForm,tags)
    
    def f:((metadata.Workflow,play.data.Form[metadata.Comment],String) => play.api.templates.HtmlFormat.Appendable) = (workflow,commentForm,tags) => apply(workflow,commentForm,tags)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 11 08:39:53 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/workflowDisplay.scala.html
                    HASH: ea7b5dbac066fae386f17016536273ede3b24e97
                    MATRIX: 843->1|1024->111|1038->118|1122->122|1172->137|1186->143|1247->183|1356->265|1384->266|1424->278|1453->279|1508->89|1537->109|1565->295|1603->298|1638->324|1678->326|1716->329|1753->344|2589->1144|2606->1152|2639->1163|2981->1469|2998->1477|3037->1494|3379->1800|3396->1808|3435->1825|3777->2131|3794->2139|3833->2156|4159->2446|4176->2454|4211->2467|4536->2756|4562->2760|5218->3380|5235->3388|5269->3399|5722->3816|5759->3844|5799->3846|5858->3868|5874->3874|5950->3940|5991->3942|6122->4036|6227->4117|6392->4249|6443->4267|6498->4285|6552->4322|6592->4323|6759->4453|6836->4506|6882->4514|6898->4519|6939->4536|7048->4608|7063->4613|7110->4637|7322->4812|7337->4817|7377->4834|7526->4946|7566->4976|7607->4978|7737->5075|7804->5105|7858->5142|7898->5143|8128->5336|8203->5387|8249->5395|8271->5406|8304->5415|8425->5499|8446->5510|8486->5526|8734->5737|8755->5748|8787->5757|8936->5873|9003->5903|9041->5931|9082->5933|9153->5967|9169->5973|9257->6050|9299->6052|9437->6153|9544->6236|9742->6401|9805->6431|9914->6507|9997->7122|10038->10743
                    LINES: 26->1|29->6|29->6|31->6|32->7|32->7|32->7|34->9|34->9|36->11|36->11|39->1|42->5|43->13|45->15|45->15|45->15|47->17|47->17|72->42|72->42|72->42|77->47|77->47|77->47|82->52|82->52|82->52|87->57|87->57|87->57|92->62|92->62|92->62|98->68|98->68|117->87|117->87|117->87|129->99|129->99|129->99|130->100|130->100|130->100|130->100|132->102|132->102|135->105|136->106|137->107|137->107|137->107|140->110|140->110|140->110|140->110|140->110|141->111|141->111|141->111|144->114|144->114|144->114|147->117|147->117|147->117|149->119|150->120|150->120|150->120|153->123|153->123|153->123|153->123|153->123|154->124|154->124|154->124|157->127|157->127|157->127|160->130|161->131|161->131|161->131|162->132|162->132|162->132|162->132|164->134|164->134|167->137|168->138|171->141|178->167|186->283
                    -- GENERATED --
                */
            