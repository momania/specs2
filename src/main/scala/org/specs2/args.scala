package specs2

import org.specs2.control.StackTraceFilter
import org.specs2.main.{ArgProperties, ArgProperty, Arguments, Diffs}

/**
 * import args._ to get access to all the Arguments creation functions
 */
object args extends org.specs2.main.ArgumentsArgs with ArgProperties {
  def apply (
    ex:            ArgProperty[String]            = ArgProperty[String](),
    xonly:         ArgProperty[Boolean]           = ArgProperty[Boolean](),
    include:       ArgProperty[String]            = ArgProperty[String](),
    exclude:       ArgProperty[String]            = ArgProperty[String](),
    plan:          ArgProperty[Boolean]           = ArgProperty[Boolean](),
    skipAll:       ArgProperty[Boolean]           = ArgProperty[Boolean](),
    stopOnFail:    ArgProperty[Boolean]           = ArgProperty[Boolean](),
    failtrace:     ArgProperty[Boolean]           = ArgProperty[Boolean](),
    color:         ArgProperty[Boolean]           = ArgProperty[Boolean](),
    noindent:      ArgProperty[Boolean]           = ArgProperty[Boolean](),
    showlevel:     ArgProperty[Boolean]           = ArgProperty[Boolean](),
    showtimes:     ArgProperty[Boolean]           = ArgProperty[Boolean](),
    offset:        ArgProperty[Int]               = ArgProperty[Int](),
    specName:      ArgProperty[String]            = ArgProperty[String](),
    sequential:    ArgProperty[Boolean]           = ArgProperty[Boolean](),
    threadsNb:     ArgProperty[Int]               = ArgProperty[Int](),
    markdown:      ArgProperty[Boolean]           = ArgProperty[Boolean](),
    debugMarkdown: ArgProperty[Boolean]           = ArgProperty[Boolean](),
    diffs:         ArgProperty[Diffs]             = ArgProperty[Diffs](),
    fromSource:    ArgProperty[Boolean]           = ArgProperty[Boolean](),
    traceFilter:   ArgProperty[StackTraceFilter]  = ArgProperty[StackTraceFilter](),
    commandLine:   Seq[String]                    = Nil
  ) = args(
    ex            ,
    xonly         ,
    include       ,
    exclude       ,
    plan          ,
    skipAll       ,
    stopOnFail    ,
    failtrace     ,
    color         ,
    noindent      ,
    showlevel     ,
    showtimes     ,
    offset        ,
    specName      ,
    sequential    ,
    threadsNb     ,
    markdown      ,
    debugMarkdown ,
    diffs         ,
    fromSource    ,
    traceFilter   ,
    commandLine
  )
}