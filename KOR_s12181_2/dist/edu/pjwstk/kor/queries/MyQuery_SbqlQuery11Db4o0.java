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


public class MyQuery_SbqlQuery11Db4o0 implements Db4oSBQLQuery<java.util.Collection<edu.pjwstk.kor.model.Employee>> {
    private java.lang.Integer param;

    public MyQuery_SbqlQuery11Db4o0(java.lang.Integer param) {
        this.param = param;
    }

    /**
     * query='dataBase.(Employee as em where em.getSalary() < param)'
    '
     **/
    public java.util.Collection<edu.pjwstk.kor.model.Employee> executeQuery(
        final ObjectContainerBase ocb, final Transaction t) {
        //evaluateExpression - start Employee as em where em.getSalary() < param
        final LocalTransaction transLocal = (LocalTransaction) t;

        //visitWhereExpression - start Employee as em where em.getSalary() < param
        //visitAsExpression - start Employee as em
        //visitIdentifierExpression - start Employee
        final java.util.Collection<edu.pjwstk.kor.model.Employee> _ident_Employee =
            new java.util.ArrayList<edu.pjwstk.kor.model.Employee>();
        ClassMetadata _classMeta20 = ocb.classCollection()
                                        .getClassMetadata("edu.pjwstk.kor.model.Employee");
        long[] _ids20 = _classMeta20.getIDs(transLocal);

        for (long _id20 : _ids20) {
            LazyObjectReference _ref20 = transLocal.lazyReferenceFor((int) _id20);
            _ident_Employee.add((edu.pjwstk.kor.model.Employee) _ref20.getObject());
        }

        //visitIdentifierExpression - end Employee
        java.util.Collection<edu.pjwstk.kor.model.Employee> _asResult_em = _ident_Employee;

        //visitAsExpression - end Employee as em
        java.util.Collection<edu.pjwstk.kor.model.Employee> _whereResult = new java.util.ArrayList<edu.pjwstk.kor.model.Employee>();
        int _whereLoopIndex = 0;

        for (edu.pjwstk.kor.model.Employee _whereEl : _asResult_em) {
            if (_whereEl == null) {
                continue;
            }

            if (_whereEl != null) {
                ocb.activate(_whereEl, 1);
            }

            //visitBinaryAExpression - start em.getSalary() < param
            //visitDotExpression - start em.getSalary()
            //visitIdentifierExpression - start em
            edu.pjwstk.kor.model.Employee _ident_em = _whereEl;

            if (_ident_em != null) {
                ocb.activate(_ident_em, 1);
            }

            //visitIdentifierExpression - end em
            edu.pjwstk.kor.model.Employee _dotEl = _ident_em;

            if (_ident_em != null) {
                ocb.activate(_ident_em, 2);
            }

            //visitMethodExpression - start getSalary()
            java.lang.Integer _mth_getSalaryResult = _dotEl.getSalary();

            if (_mth_getSalaryResult != null) {
                ocb.activate(_mth_getSalaryResult, 1);
            }

            //visitMethodExpression - end getSalary()
            //visitDotExpression - end em.getSalary()
            //visitIdentifierExpression - start param
            java.lang.Integer _ident_param = param;

            //visitIdentifierExpression - end param
            //OperatorLess - start em.getSalary() < param
            Boolean _lessResult = _mth_getSalaryResult < _ident_param;

            //OperatorLess - end em.getSalary() < param
            //visitBinaryAExpression - end em.getSalary() < param
            if (_lessResult) {
                _whereResult.add(_whereEl);
            }

            _whereLoopIndex++;
        }

        //visitWhereExpression - end Employee as em where em.getSalary() < param
        pl.wcislo.sbql4j.db4o.utils.DerefUtils.activateResult(_whereResult, ocb);

        return _whereResult;

        //evaluateExpression - end Employee as em where em.getSalary() < param
    }
}
