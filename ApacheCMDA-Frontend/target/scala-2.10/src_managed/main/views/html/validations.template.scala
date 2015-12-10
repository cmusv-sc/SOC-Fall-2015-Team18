
package views.html

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
object validations extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[_]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""
"""),_display_(Seq[Any](/*2.2*/if(form.hasGlobalErrors)/*2.26*/ {_display_(Seq[Any](format.raw/*2.28*/("""
<div class="alert alert-danger" role="alert">
    <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
    <span class="sr-only">Error:</span>
    """),_display_(Seq[Any](/*6.6*/form/*6.10*/.globalError.message)),format.raw/*6.30*/("""
</div>
""")))})))}
    }
    
    def render(form:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 04 22:59:58 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/validations.scala.html
                    HASH: 5fd6baed801574302f8cf872a5666b6f032b09c8
                    MATRIX: 852->1|961->16|997->18|1029->42|1068->44|1276->218|1288->222|1329->242
                    LINES: 28->1|31->1|32->2|32->2|32->2|36->6|36->6|36->6
                    -- GENERATED --
                */
            