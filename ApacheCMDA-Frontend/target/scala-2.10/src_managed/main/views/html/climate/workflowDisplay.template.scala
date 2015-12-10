
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
object workflowDisplay extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[metadata.Workflow,play.data.Form[metadata.Comment],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(workflow: metadata.Workflow, commentForm: play.data.Form[metadata.Comment]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*5.2*/scripts/*5.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
<script src='"""),_display_(Seq[Any](/*6.15*/routes/*6.21*/.Assets.at("javascripts/edit_button.js"))),format.raw/*6.61*/("""'></script>
<script type="text/javascript">
          $(document).ready(function()"""),format.raw/*8.39*/("""{"""),format.raw/*8.40*/("""

          """),format.raw/*10.11*/("""}"""),format.raw/*10.12*/(""");
  </script>
""")))};
Seq[Any](format.raw/*1.78*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*12.2*/("""

"""),_display_(Seq[Any](/*14.2*/main("Workflows", scripts)/*14.28*/ {_display_(Seq[Any](format.raw/*14.30*/("""

"""),_display_(Seq[Any](/*16.2*/flash_message())),format.raw/*16.17*/("""


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
                              id="Title_detail">"""),_display_(Seq[Any](/*41.50*/workflow/*41.58*/.getTitle())),format.raw/*41.69*/("""</td>
                </tr>
                <tr id="Description_trID">
                    <td id="Description">Workflow Description</td>
                    <td><span type="text" class="form-control"
                              id="Description_detail">"""),_display_(Seq[Any](/*46.56*/workflow/*46.64*/.getDescription())),format.raw/*46.81*/("""</td>
                </tr>
                <tr id="Contributor_trID">
                    <td id="Contributor">Workflow Contributor</td>
                    <td><span type="text" class="form-control"
                              id="Contributor_detail">"""),_display_(Seq[Any](/*51.56*/workflow/*51.64*/.getContributor())),format.raw/*51.81*/("""</td>
                </tr>
                <tr id="Instruction_trID">
                    <td id="Instruction">Workflow Instruction</td>
                    <td><span type="text" class="form-control"
                              id="Instruction_detail">"""),_display_(Seq[Any](/*56.56*/workflow/*56.64*/.getInstruction())),format.raw/*56.81*/("""</td>
                </tr>
                <tr id="Dataset_trID">
                    <td id="Dataset">Workflow Dataset</td>
                    <td><span type="text" class="form-control"
                              id="Dataset_detail">"""),_display_(Seq[Any](/*61.52*/workflow/*61.60*/.getDataset())),format.raw/*61.73*/("""</td>
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
                    <td><a id="workflowImgLink" href=""> <img src="http://i.stack.imgur.com/wpt5k.jpg"
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
        """),_display_(Seq[Any](/*92.10*/if(workflow.visibility == 1)/*92.38*/ {_display_(Seq[Any](format.raw/*92.40*/("""
            """),_display_(Seq[Any](/*93.14*/helper/*93.20*/.form(routes.WorkflowController.addLevelComment(workflow.getId()))/*93.86*/ {_display_(Seq[Any](format.raw/*93.88*/("""
            <div class = "form-group" id="commentForm">
                """),_display_(Seq[Any](/*95.18*/textarea(commentForm("Comment on workflow"), 'rows -> 3, 'style -> "width: 80%;"))),format.raw/*95.99*/("""
            </div>
            <input class="btn" type="submit" value="Add Comments">
            """)))})),format.raw/*98.14*/("""
        """)))})),format.raw/*99.10*/("""
        """),_display_(Seq[Any](/*100.10*/for(level <- workflow.getLevelList()) yield /*100.47*/{_display_(Seq[Any](format.raw/*100.48*/("""
        <div class="pi">
            <div>
                <h5 class="alignleft"><a href = """"),_display_(Seq[Any](/*103.51*/{routes.UserController.oneUser(level.comment.userId)})),format.raw/*103.104*/("""">User """),_display_(Seq[Any](/*103.112*/level/*103.117*/.comment.userName)),format.raw/*103.134*/("""</a></h5>
                <h5 class="alignright">Posted on """),_display_(Seq[Any](/*104.51*/level/*104.56*/.comment.date.toString())),format.raw/*104.80*/("""</h5>
            </div>
            <div class="pcommenttext" style="clear: both;" align="left">
                <p class="fontnewroman">"""),_display_(Seq[Any](/*107.42*/level/*107.47*/.comment.comments)),format.raw/*107.64*/("""</p>
            </div>
            <div class="pcomment">
                """),_display_(Seq[Any](/*110.18*/if(level.commentList.size()>0)/*110.48*/ {_display_(Seq[Any](format.raw/*110.50*/("""
                <h5 class="alignleft">Replies</h5>
                """)))})),format.raw/*112.18*/("""
                """),_display_(Seq[Any](/*113.18*/for(eachComment <- level.commentList) yield /*113.55*/{_display_(Seq[Any](format.raw/*113.56*/("""
                <div class="pcontent" style="clear: both;">
                    <div>
                        <h5 class="alignleft"><a href = """"),_display_(Seq[Any](/*116.59*/{routes.UserController.oneUser(eachComment.userId)})),format.raw/*116.110*/("""">User """),_display_(Seq[Any](/*116.118*/eachComment/*116.129*/.userName)),format.raw/*116.138*/("""</a></h5>
                        <h5 class="alignright">Posted on """),_display_(Seq[Any](/*117.59*/eachComment/*117.70*/.date.toString())),format.raw/*117.86*/("""</h5>
                    </div>
                    <div class="pcommenttext" style="clear: both;" align="left">
                        <p class="fontnewroman">"""),_display_(Seq[Any](/*120.50*/eachComment/*120.61*/.comments)),format.raw/*120.70*/("""</p>
                    </div>
                </div>
                """)))})),format.raw/*123.18*/("""
                """),_display_(Seq[Any](/*124.18*/if(workflow.visibility == 1)/*124.46*/ {_display_(Seq[Any](format.raw/*124.48*/("""
                    """),_display_(Seq[Any](/*125.22*/helper/*125.28*/.form(routes.WorkflowController.addSingleComment(workflow.getId(), level.id))/*125.105*/ {_display_(Seq[Any](format.raw/*125.107*/("""
                    <div class = "form-group">
                        """),_display_(Seq[Any](/*127.26*/textarea(commentForm("Reply on this comment"), 'rows -> 3, 'style -> "width: 80%;"))),format.raw/*127.109*/("""
                    </div>
                    <input class="btn" type="submit" value="Reply">
                    """)))})),format.raw/*130.22*/("""
                """)))})),format.raw/*131.18*/("""
            </div>
        </div>
        """)))})),format.raw/*134.10*/("""
    </div>

    </body>

</div>

"""),format.raw/*160.11*/("""


""")))})))}
    }
    
    def render(workflow:metadata.Workflow,commentForm:play.data.Form[metadata.Comment]): play.api.templates.HtmlFormat.Appendable = apply(workflow,commentForm)
    
    def f:((metadata.Workflow,play.data.Form[metadata.Comment]) => play.api.templates.HtmlFormat.Appendable) = (workflow,commentForm) => apply(workflow,commentForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 10 08:13:38 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/workflowDisplay.scala.html
                    HASH: 2d22174ff0ad9ee210a393bac00d6d921f9317ae
                    MATRIX: 836->1|1005->98|1019->105|1103->109|1153->124|1167->130|1228->170|1337->252|1365->253|1405->265|1434->266|1489->77|1517->96|1545->282|1583->285|1618->311|1658->313|1696->316|1733->331|2419->981|2436->989|2469->1000|2761->1256|2778->1264|2817->1281|3109->1537|3126->1545|3165->1562|3457->1818|3474->1826|3513->1843|3789->2083|3806->2091|3841->2104|4737->2964|4774->2992|4814->2994|4864->3008|4879->3014|4954->3080|4994->3082|5104->3156|5207->3237|5339->3337|5381->3347|5428->3357|5482->3394|5522->3395|5653->3489|5730->3542|5776->3550|5792->3555|5833->3572|5930->3632|5945->3637|5992->3661|6168->3800|6183->3805|6223->3822|6336->3898|6376->3928|6417->3930|6519->3999|6574->4017|6628->4054|6668->4055|6850->4200|6925->4251|6971->4259|6993->4270|7026->4279|7131->4347|7152->4358|7191->4374|7391->4537|7412->4548|7444->4557|7549->4629|7604->4647|7642->4675|7683->4677|7742->4699|7758->4705|7846->4782|7888->4784|7998->4857|8105->4940|8255->5057|8306->5075|8383->5119|8446->5726
                    LINES: 26->1|29->5|29->5|31->5|32->6|32->6|32->6|34->8|34->8|36->10|36->10|39->1|41->4|42->12|44->14|44->14|44->14|46->16|46->16|71->41|71->41|71->41|76->46|76->46|76->46|81->51|81->51|81->51|86->56|86->56|86->56|91->61|91->61|91->61|122->92|122->92|122->92|123->93|123->93|123->93|123->93|125->95|125->95|128->98|129->99|130->100|130->100|130->100|133->103|133->103|133->103|133->103|133->103|134->104|134->104|134->104|137->107|137->107|137->107|140->110|140->110|140->110|142->112|143->113|143->113|143->113|146->116|146->116|146->116|146->116|146->116|147->117|147->117|147->117|150->120|150->120|150->120|153->123|154->124|154->124|154->124|155->125|155->125|155->125|155->125|157->127|157->127|160->130|161->131|164->134|171->160
                    -- GENERATED --
                */
            