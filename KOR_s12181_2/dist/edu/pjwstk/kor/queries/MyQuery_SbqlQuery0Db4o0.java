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

import java.sql.Struct;

import java.text.SimpleDateFormat;

import java.util.*;
import java.util.Date;


public class MyQuery_SbqlQuery0Db4o0 implements Db4oSBQLQuery<java.util.Collection<java.lang.String>> {
    public MyQuery_SbqlQuery0Db4o0() {
    }

    /**
     * query='dataBase.Packagement.getSizeType()'
    '
     **/
    public java.util.Collection<java.lang.String> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        //evaluateExpression - start Packagement.getSizeType()
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitDotExpression - start Packagement.getSizeType()
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
        java.util.Collection<java.lang.String> _dotResult = new java.util.ArrayList<java.lang.String>();
        int _dotIndex = 0;

        for (edu.pjwstk.kor.model.Packagement _dotEl : _ident_Packagement) {
            if (_dotEl == null) {
                continue;
            }

            if (_dotEl != null) {
                ocb.activate(_dotEl, 1);
            }

            //visitMethodExpression - start getSizeType()
            java.lang.String _mth_getSizeTypeResult = _dotEl.getSizeType();

            if (_mth_getSizeTypeResult != null) {
                ocb.activate(_mth_getSizeTypeResult, 1);
            }

            //visitMethodExpression - end getSizeType()
            if (_mth_getSizeTypeResult != null) {
                ocb.activate(_mth_getSizeTypeResult, 1);
            }

            _dotResult.add(_mth_getSizeTypeResult);
            _dotIndex++;
        }

        //visitDotExpression - end Packagement.getSizeType()
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_dotResult, ocb);

        return _dotResult;

        //evaluateExpression - end Packagement.getSizeType()
    }
}
