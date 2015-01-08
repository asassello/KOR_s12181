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


public class MyQuery_SbqlQuery42Db4o0 implements Db4oSBQLQuery<java.lang.Integer> {
    public MyQuery_SbqlQuery42Db4o0() {
    }

    /**
     * query='dataBase.( count((Receiver.getCity() as rc where rc == "Rzeszow")))'
    '
     **/
    public java.lang.Integer executeQuery(final ObjectContainerBase ocb,
        final Transaction t) {
        //evaluateExpression - start  count((Receiver.getCity() as rc where rc == "Rzeszow"))
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitUnaryExpression - start  count((Receiver.getCity() as rc where rc == "Rzeszow"))
        //visitWhereExpression - start Receiver.getCity() as rc where rc == "Rzeszow"
        //visitAsExpression - start Receiver.getCity() as rc
        //visitDotExpression - start Receiver.getCity()
        //visitIdentifierExpression - start Receiver
        final java.util.Collection<edu.pjwstk.kor.model.Receiver> _ident_Receiver =
            new java.util.ArrayList<edu.pjwstk.kor.model.Receiver>();
        ClassMetadata _classMeta59 = ocb.classCollection()
                                        .getClassMetadata("edu.pjwstk.kor.model.Receiver");
        long[] _ids59 = _classMeta59.getIDs(transLocal);

        for (long _id59 : _ids59) {
            LazyObjectReference _ref59 = transLocal.lazyReferenceFor((int) _id59);
            _ident_Receiver.add((edu.pjwstk.kor.model.Receiver) _ref59.getObject());
        }

        //visitIdentifierExpression - end Receiver
        java.util.Collection<java.lang.String> _dotResult = new java.util.ArrayList<java.lang.String>();
        int _dotIndex = 0;

        for (edu.pjwstk.kor.model.Receiver _dotEl : _ident_Receiver) {
            if (_dotEl == null) {
                continue;
            }

            if (_dotEl != null) {
                ocb.activate(_dotEl, 1);
            }

            //visitMethodExpression - start getCity()
            java.lang.String _mth_getCityResult = _dotEl.getCity();

            if (_mth_getCityResult != null) {
                ocb.activate(_mth_getCityResult, 1);
            }

            //visitMethodExpression - end getCity()
            if (_mth_getCityResult != null) {
                ocb.activate(_mth_getCityResult, 1);
            }

            _dotResult.add(_mth_getCityResult);
            _dotIndex++;
        }

        //visitDotExpression - end Receiver.getCity()
        java.util.Collection<java.lang.String> _asResult_rc = _dotResult;

        //visitAsExpression - end Receiver.getCity() as rc
        java.util.Collection<java.lang.String> _whereResult = new java.util.ArrayList<java.lang.String>();
        int _whereLoopIndex = 0;

        for (java.lang.String _whereEl : _asResult_rc) {
            if (_whereEl == null) {
                continue;
            }

            if (_whereEl != null) {
                ocb.activate(_whereEl, 1);
            }

            //visitBinaryAExpression - start rc == "Rzeszow"
            //visitIdentifierExpression - start rc
            java.lang.String _ident_rc = _whereEl;

            if (_ident_rc != null) {
                ocb.activate(_ident_rc, 1);
            }

            //visitIdentifierExpression - end rc
            //visitLiteralExpression - start "Rzeszow"
            //visitLiteralExpression - end "Rzeszow"
            //OperatorEquals - start rc == "Rzeszow"
            java.lang.Boolean _equalsResult = OperatorUtils.equalsSafe(_ident_rc,
                    "Rzeszow");

            //OperatorEquals - end rc == "Rzeszow"
            //visitBinaryAExpression - end rc == "Rzeszow"
            if (_equalsResult) {
                _whereResult.add(_whereEl);
            }

            _whereLoopIndex++;
        }

        //visitWhereExpression - end Receiver.getCity() as rc where rc == "Rzeszow"
        //OperatorCount - start  count((Receiver.getCity() as rc where rc == "Rzeszow"))
        java.lang.Integer _countResult = _whereResult.size();
        //OperatorCount - end  count((Receiver.getCity() as rc where rc == "Rzeszow"))
        //visitUnaryExpression - end  count((Receiver.getCity() as rc where rc == "Rzeszow"))
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_countResult, ocb);

        return _countResult;

        //evaluateExpression - end  count((Receiver.getCity() as rc where rc == "Rzeszow"))
    }
}
