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


public class MyQuery_SbqlQuery45Db4o0 implements Db4oSBQLQuery<java.lang.Double> {
    public MyQuery_SbqlQuery45Db4o0() {
    }

    /**
     * query='dataBase.((0.0 +  count(Shipment))/  count( unique Shipment.Sender))'
    '
     **/
    public java.lang.Double executeQuery(final ObjectContainerBase ocb,
        final Transaction t) {
        //evaluateExpression - start (0.0 +  count(Shipment))/  count( unique Shipment.Sender)
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitBinaryAExpression - start (0.0 +  count(Shipment))/  count( unique Shipment.Sender)
        //visitBinaryAExpression - start 0.0 +  count(Shipment)
        //visitLiteralExpression - start 0.0
        //visitLiteralExpression - end 0.0
        //visitUnaryExpression - start  count(Shipment)
        //visitIdentifierExpression - start Shipment
        final java.util.Collection<edu.pjwstk.kor.model.Shipment> _ident_Shipment =
            new java.util.ArrayList<edu.pjwstk.kor.model.Shipment>();
        ClassMetadata _classMeta62 = ocb.classCollection()
                                        .getClassMetadata("edu.pjwstk.kor.model.Shipment");
        long[] _ids62 = _classMeta62.getIDs(transLocal);

        for (long _id62 : _ids62) {
            LazyObjectReference _ref62 = transLocal.lazyReferenceFor((int) _id62);
            _ident_Shipment.add((edu.pjwstk.kor.model.Shipment) _ref62.getObject());
        }

        //visitIdentifierExpression - end Shipment
        //OperatorCount - start  count(Shipment)
        java.lang.Integer _countResult = _ident_Shipment.size();

        //OperatorCount - end  count(Shipment)
        //visitUnaryExpression - end  count(Shipment)
        //OperatorPlus - start 0.0 +  count(Shipment)
        java.lang.Double _plusResult = 0.0 + _countResult;

        //OperatorPlus - end 0.0 +  count(Shipment)
        //visitBinaryAExpression - end 0.0 +  count(Shipment)
        //visitUnaryExpression - start  count( unique Shipment.Sender)
        //visitUnaryExpression - start  unique Shipment.Sender
        //visitDotExpression - start Shipment.Sender
        //visitIdentifierExpression - start Shipment
        final java.util.Collection<edu.pjwstk.kor.model.Shipment> _ident_Shipment1 =
            new java.util.ArrayList<edu.pjwstk.kor.model.Shipment>();
        ClassMetadata _classMeta63 = ocb.classCollection()
                                        .getClassMetadata("edu.pjwstk.kor.model.Shipment");
        long[] _ids63 = _classMeta63.getIDs(transLocal);

        for (long _id63 : _ids63) {
            LazyObjectReference _ref63 = transLocal.lazyReferenceFor((int) _id63);
            _ident_Shipment1.add((edu.pjwstk.kor.model.Shipment) _ref63.getObject());
        }

        //visitIdentifierExpression - end Shipment
        java.util.Collection<edu.pjwstk.kor.model.Sender> _dotResult = new java.util.ArrayList<edu.pjwstk.kor.model.Sender>();
        int _dotIndex = 0;

        for (edu.pjwstk.kor.model.Shipment _dotEl : _ident_Shipment1) {
            if (_dotEl == null) {
                continue;
            }

            if (_dotEl != null) {
                ocb.activate(_dotEl, 1);
            }

            //visitIdentifierExpression - start Sender
            final java.util.Collection<edu.pjwstk.kor.model.Sender> _ident_Sender =
                new java.util.ArrayList<edu.pjwstk.kor.model.Sender>();
            ClassMetadata _classMeta64 = ocb.classCollection()
                                            .getClassMetadata("edu.pjwstk.kor.model.Sender");
            long[] _ids64 = _classMeta64.getIDs(transLocal);

            for (long _id64 : _ids64) {
                LazyObjectReference _ref64 = transLocal.lazyReferenceFor((int) _id64);
                _ident_Sender.add((edu.pjwstk.kor.model.Sender) _ref64.getObject());
            }

            //visitIdentifierExpression - end Sender
            if (_ident_Sender != null) {
                ocb.activate(_ident_Sender, 2);
            }

            _dotResult.addAll(_ident_Sender);
            _dotIndex++;
        }

        //visitDotExpression - end Shipment.Sender
        //OperatorUnique - start  unique Shipment.Sender
        java.util.Collection<edu.pjwstk.kor.model.Sender> _uniqueResult = new java.util.ArrayList<edu.pjwstk.kor.model.Sender>();
        Set<edu.pjwstk.kor.model.Sender> _tmp2 = new LinkedHashSet<edu.pjwstk.kor.model.Sender>();
        _tmp2.addAll(_dotResult);
        _uniqueResult.addAll(_tmp2);

        //OperatorUnique - end  unique Shipment.Sender
        //visitUnaryExpression - end  unique Shipment.Sender
        //OperatorCount - start  count( unique Shipment.Sender)
        java.lang.Integer _countResult1 = _uniqueResult.size();

        //OperatorCount - end  count( unique Shipment.Sender)
        //visitUnaryExpression - end  count( unique Shipment.Sender)
        //OperatorDivide - start (0.0 +  count(Shipment))/  count( unique Shipment.Sender)
        java.lang.Double _divideResult = _plusResult / _countResult1;
        //OperatorDivide - end (0.0 +  count(Shipment))/  count( unique Shipment.Sender)
        //visitBinaryAExpression - end (0.0 +  count(Shipment))/  count( unique Shipment.Sender)
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_divideResult, ocb);

        return _divideResult;

        //evaluateExpression - end (0.0 +  count(Shipment))/  count( unique Shipment.Sender)
    }
}
