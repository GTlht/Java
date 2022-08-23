package com.annotation;

//@MyAnno2(aaa=18)
//@MyAnno2(bbb="tom")
//@MyAnno2(ccc=MyEnum.E1)
//@MyAnno2(ddd=@MyAnno1)
//@MyAnno2(eee="tom")
//@MyAnno2(eee= {"tom"})
//@MyAnno2(eee= {"tom","jerry","rose"})
@MyAnno2(aaa=18, bbb="tom", ccc=MyEnum.E2, ddd=@MyAnno1, eee= {"tom","jerry"})
public class Demo04 {

}
