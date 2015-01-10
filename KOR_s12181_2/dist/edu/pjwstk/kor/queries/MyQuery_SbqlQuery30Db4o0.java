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


public class MyQuery_SbqlQuery30Db4o0 implements Db4oSBQLQuery<java.util.Collection<edu.pjwstk.kor.model.Receiver>> {
    public MyQuery_SbqlQuery30Db4o0() {
    }

    /**
     * query='dataBase.(Receiver where  exists getSecondaryAdress())'
    '
     **/
    public java.util.Collection<edu.pjwstk.kor.model.Receiver> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        //evaluateExpression - start Receiver where  exists getSecondaryAdress()
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitWhereExpression - start Receiver where  exists getSecondaryAdress()
        //visitIdentifierExpression - start Receiver
        final java.util.Collection<edu.pjwstk.kor.model.Receiver> _ident_Receiver =
            new java.util.ArrayList<edu.pjwstk.kor.model.Receiver>();
        ClassMetadata _classMeta42 = ocb.classCollection()
                                        .getClassMetadata("edu.pjwstk.kor.model.Receiver");
        long[] _ids42 = _classMeta42.getIDs(transLocal);

        for (long _id42 : _ids42) {
            LazyObjectReference _ref42 = transLocal.lazyReferenceFor((int) _id42);
            _ident_Receiver.add((edu.pjwstk.kor.model.Receiver) _ref42.getObject());
        }

        //visitIdentifierExpression - end Receiver
        java.util.Collection<edu.pjwstk.kor.model.Receiver> _whereResult = new java.util.ArrayList<edu.pjwstk.kor.model.Receiver>();
        int _whereLoopIndex = 0;

        for (edu.pjwstk.kor.model.Receiver _whereEl : _ident_Receiver) {
            if (_whereEl == null) {
                continue;
            }

            if (_whereEl != null) {
                ocb.activate(_whereEl, 1);
            }

            //visitUnaryExpression - start  exists getSecondaryAdress()
            //visitMethodExpression - start getSecondaryAdress()
            edu.pjwstk.kor.model.Adress _mth_getSecondaryAdressResult = _whereEl.getSecondaryAdress();

            if (_mth_getSecondaryAdressResult != null) {
                ocb.activate(_mth_getSecondaryAdressResult, 1);
            }

            //visitMethodExpression - end getSecondaryAdress()
            //OperatorExists - start  exists getSecondaryAdress()
            java.lang.Boolean _existsResult = _mth_getSecondaryAdressResult != null;

            //OperatorExists - end  exists getSecondaryAdress()
            //visitUnaryExpression - end  exists getSecondaryAdress()
            if (_existsResult) {
                _whereResult.add(_whereEl);
            }

            _whereLoopIndex++;
        }

        //visitWhereExpression - end Receiver where  exists getSecondaryAdress()
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_whereResult, ocb);

        return _whereResult;

        //evaluateExpression - end Receiver where  exists getSecondaryAdress()
    }
}
