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


public class MyQuery_SbqlQuery5Db4o0 implements Db4oSBQLQuery<java.lang.Integer> {
    public MyQuery_SbqlQuery5Db4o0() {
    }

    /**
     * query='dataBase.( count((Shipment where getIsComplaint() == true)))'
    '
     **/
    public java.lang.Integer executeQuery(final ObjectContainerBase ocb,
        final Transaction t) {
        //evaluateExpression - start  count((Shipment where getIsComplaint() == true))
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitUnaryExpression - start  count((Shipment where getIsComplaint() == true))
        //visitWhereExpression - start Shipment where getIsComplaint() == true
        //visitIdentifierExpression - start Shipment
        final java.util.Collection<edu.pjwstk.kor.model.Shipment> _ident_Shipment =
            new java.util.ArrayList<edu.pjwstk.kor.model.Shipment>();
        ClassMetadata _classMeta6 = ocb.classCollection()
                                       .getClassMetadata("edu.pjwstk.kor.model.Shipment");
        long[] _ids6 = _classMeta6.getIDs(transLocal);

        for (long _id6 : _ids6) {
            LazyObjectReference _ref6 = transLocal.lazyReferenceFor((int) _id6);
            _ident_Shipment.add((edu.pjwstk.kor.model.Shipment) _ref6.getObject());
        }

        //visitIdentifierExpression - end Shipment
        java.util.Collection<edu.pjwstk.kor.model.Shipment> _whereResult = new java.util.ArrayList<edu.pjwstk.kor.model.Shipment>();
        int _whereLoopIndex = 0;

        for (edu.pjwstk.kor.model.Shipment _whereEl : _ident_Shipment) {
            if (_whereEl == null) {
                continue;
            }

            if (_whereEl != null) {
                ocb.activate(_whereEl, 1);
            }

            //visitBinaryAExpression - start getIsComplaint() == true
            //visitMethodExpression - start getIsComplaint()
            java.lang.Boolean _mth_getIsComplaintResult = _whereEl.getIsComplaint();

            if (_mth_getIsComplaintResult != null) {
                ocb.activate(_mth_getIsComplaintResult, 1);
            }

            //visitMethodExpression - end getIsComplaint()
            //visitLiteralExpression - start true
            //visitLiteralExpression - end true
            //OperatorEquals - start getIsComplaint() == true
            java.lang.Boolean _equalsResult = OperatorUtils.equalsSafe(_mth_getIsComplaintResult,
                    true);

            //OperatorEquals - end getIsComplaint() == true
            //visitBinaryAExpression - end getIsComplaint() == true
            if (_equalsResult) {
                _whereResult.add(_whereEl);
            }

            _whereLoopIndex++;
        }

        //visitWhereExpression - end Shipment where getIsComplaint() == true
        //OperatorCount - start  count((Shipment where getIsComplaint() == true))
        java.lang.Integer _countResult = _whereResult.size();
        //OperatorCount - end  count((Shipment where getIsComplaint() == true))
        //visitUnaryExpression - end  count((Shipment where getIsComplaint() == true))
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_countResult, ocb);

        return _countResult;

        //evaluateExpression - end  count((Shipment where getIsComplaint() == true))
    }
}
