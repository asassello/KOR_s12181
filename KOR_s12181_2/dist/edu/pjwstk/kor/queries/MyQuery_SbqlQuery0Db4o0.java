package edu.pjwstk.kor.queries;

import com.db4o.*;
import com.db4o.ObjectContainer;

import com.db4o.foundation.*;

import com.db4o.internal.*;
import com.db4o.internal.btree.*;

import edu.pjwstk.kor.model.*;
import edu.pjwstk.kor.model.data.*;

import org.apache.commons.collections.CollectionUtils;

import pl.wcislo.sbql4j.db4o.*;
import pl.wcislo.sbql4j.exception.*;
import pl.wcislo.sbql4j.java.model.runtime.*;
import pl.wcislo.sbql4j.java.model.runtime.factory.*;
import pl.wcislo.sbql4j.java.utils.ArrayUtils;
import pl.wcislo.sbql4j.java.utils.OperatorUtils;
import pl.wcislo.sbql4j.java.utils.Pair;
import pl.wcislo.sbql4j.lang.codegen.nostacks.*;
import pl.wcislo.sbql4j.lang.codegen.simple.*;
import pl.wcislo.sbql4j.lang.db4o.*;
import pl.wcislo.sbql4j.lang.db4o.codegen.*;
import pl.wcislo.sbql4j.lang.db4o.codegen.interpreter.*;
import pl.wcislo.sbql4j.lang.db4o.codegen.nostacks.*;
import pl.wcislo.sbql4j.lang.parser.expression.*;
import pl.wcislo.sbql4j.lang.parser.expression.OrderByParamExpression.SortType;
import pl.wcislo.sbql4j.lang.parser.terminals.*;
import pl.wcislo.sbql4j.lang.parser.terminals.operators.*;
import pl.wcislo.sbql4j.lang.types.*;
import pl.wcislo.sbql4j.lang.xml.*;
import pl.wcislo.sbql4j.model.*;
import pl.wcislo.sbql4j.model.collections.*;
import pl.wcislo.sbql4j.util.*;
import pl.wcislo.sbql4j.util.Utils;
import pl.wcislo.sbql4j.xml.model.*;
import pl.wcislo.sbql4j.xml.parser.store.*;

import java.util.*;


public class MyQuery_SbqlQuery0Db4o0 implements Db4oSBQLQuery<java.util.Collection<edu.pjwstk.kor.model.Packagement>> {
    public MyQuery_SbqlQuery0Db4o0() {
    }

    /**
     * query='dataBase.Packagement'
    '
     **/
    public java.util.Collection<edu.pjwstk.kor.model.Packagement> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        //evaluateExpression - start Packagement
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitIdentifierExpression - start Packagement
        final java.util.Collection<edu.pjwstk.kor.model.Packagement> _ident_Packagement =
            new java.util.ArrayList<edu.pjwstk.kor.model.Packagement>();
        ClassMetadata _classMeta0 = ocb.classCollection()
                                       .getClassMetadata("edu.pjwstk.kor.model.Packagement");
        long[] _ids0 = _classMeta0.getIDs(transLocal);

        for (long _id0 : _ids0) {
            LazyObjectReference _ref0 = transLocal.lazyReferenceFor((int) _id0);
            _ident_Packagement.add((edu.pjwstk.kor.model.Packagement) _ref0.getObject());
        }

        //visitIdentifierExpression - end Packagement
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_ident_Packagement,
            ocb);

        return _ident_Packagement;

        //evaluateExpression - end Packagement
    }
}
