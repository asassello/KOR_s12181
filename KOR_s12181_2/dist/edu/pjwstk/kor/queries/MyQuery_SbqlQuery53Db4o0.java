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


public class MyQuery_SbqlQuery53Db4o0 implements Db4oSBQLQuery<java.util.Collection<edu.pjwstk.kor.model.Employee>> {
    public MyQuery_SbqlQuery53Db4o0() {
    }

    /**
     * query='dataBase.(Employee as ee where ee.getPosition() != "Kierownik")'
    '
     **/
    public java.util.Collection<edu.pjwstk.kor.model.Employee> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        //evaluateExpression - start Employee as ee where ee.getPosition() != "Kierownik"
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitWhereExpression - start Employee as ee where ee.getPosition() != "Kierownik"
        //visitAsExpression - start Employee as ee
        //visitIdentifierExpression - start Employee
        final java.util.Collection<edu.pjwstk.kor.model.Employee> _ident_Employee =
            new java.util.ArrayList<edu.pjwstk.kor.model.Employee>();
        ClassMetadata _classMeta75 = ocb.classCollection()
                                        .getClassMetadata("edu.pjwstk.kor.model.Employee");
        long[] _ids75 = _classMeta75.getIDs(transLocal);

        for (long _id75 : _ids75) {
            LazyObjectReference _ref75 = transLocal.lazyReferenceFor((int) _id75);
            _ident_Employee.add((edu.pjwstk.kor.model.Employee) _ref75.getObject());
        }

        //visitIdentifierExpression - end Employee
        java.util.Collection<edu.pjwstk.kor.model.Employee> _asResult_ee = _ident_Employee;

        //visitAsExpression - end Employee as ee
        java.util.Collection<edu.pjwstk.kor.model.Employee> _whereResult = new java.util.ArrayList<edu.pjwstk.kor.model.Employee>();
        int _whereLoopIndex = 0;

        for (edu.pjwstk.kor.model.Employee _whereEl : _asResult_ee) {
            if (_whereEl == null) {
                continue;
            }

            if (_whereEl != null) {
                ocb.activate(_whereEl, 1);
            }

            //visitBinaryAExpression - start ee.getPosition() != "Kierownik"
            //visitDotExpression - start ee.getPosition()
            //visitIdentifierExpression - start ee
            edu.pjwstk.kor.model.Employee _ident_ee = _whereEl;

            if (_ident_ee != null) {
                ocb.activate(_ident_ee, 1);
            }

            //visitIdentifierExpression - end ee
            edu.pjwstk.kor.model.Employee _dotEl = _ident_ee;

            if (_ident_ee != null) {
                ocb.activate(_ident_ee, 2);
            }

            //visitMethodExpression - start getPosition()
            java.lang.String _mth_getPositionResult = _dotEl.getPosition();

            if (_mth_getPositionResult != null) {
                ocb.activate(_mth_getPositionResult, 1);
            }

            //visitMethodExpression - end getPosition()
            //visitDotExpression - end ee.getPosition()
            //visitLiteralExpression - start "Kierownik"
            //visitLiteralExpression - end "Kierownik"
            //OperatorEquals - start ee.getPosition() != "Kierownik"
            java.lang.Boolean _not_equalsResult = !OperatorUtils.equalsSafe(_mth_getPositionResult,
                    "Kierownik");

            //OperatorEquals - end ee.getPosition() != "Kierownik"
            //visitBinaryAExpression - end ee.getPosition() != "Kierownik"
            if (_not_equalsResult) {
                _whereResult.add(_whereEl);
            }

            _whereLoopIndex++;
        }

        //visitWhereExpression - end Employee as ee where ee.getPosition() != "Kierownik"
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_whereResult, ocb);

        return _whereResult;

        //evaluateExpression - end Employee as ee where ee.getPosition() != "Kierownik"
    }
}
