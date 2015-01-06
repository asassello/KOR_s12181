package edu.pjwstk.kor.queries;

import com.db4o.ObjectContainer;

import edu.pjwstk.kor.model.*;
import edu.pjwstk.kor.model.Employee;
import edu.pjwstk.kor.model.data.*;

import org.apache.commons.collections.CollectionUtils;

import pl.wcislo.sbql4j.exception.*;
import pl.wcislo.sbql4j.java.model.compiletime.Signature.SCollectionType;
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


public class MyQuery_SbqlQuery15 {
    private com.db4o.ObjectContainer dataBase;
    private java.lang.Integer param;

    public MyQuery_SbqlQuery15(final com.db4o.ObjectContainer dataBase,
        final java.lang.Integer param) {
        this.dataBase = dataBase;
        this.param = param;
    }

    /**
     * original query='dataBase.( Employee as em where em.salary < param  ).(em.name as Imie,  em.surname as Nazwisko, em.salary as Pensja)'
     *
     * query after optimization='dataBase.(Employee as em where em.getSalary() < param).(em.getName() as Imie, em.getSurname() as Nazwisko, em.getSalary() as Pensja)'
    */
    public java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> executeQuery() {
        //evaluateExpression - start dataBase.(Employee as em where em.getSalary() < param).(em.getName() as Imie, em.getSurname() as Nazwisko, em.getSalary() as Pensja)
        //visitDotExpression - start dataBase.(Employee as em where em.getSalary() < param).(em.getName() as Imie, em.getSurname() as Nazwisko, em.getSalary() as Pensja)
        //visitDotExpression - start dataBase.(Employee as em where em.getSalary() < param)
        //visitIdentifierExpression - start dataBase
        com.db4o.ObjectContainer _ident_dataBase = dataBase;

        //visitIdentifierExpression - end dataBase
        java.util.Collection<edu.pjwstk.kor.model.Employee> _dotResult1 = _ident_dataBase.query(new MyQuery_SbqlQuery15Db4o0(
                    param));
        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _queryResult =
            new java.util.ArrayList<pl.wcislo.sbql4j.java.model.runtime.Struct>();
        int _dotIndex5 = 0;

        for (edu.pjwstk.kor.model.Employee _dotEl5 : _dotResult1) {
            if (_dotEl5 == null) {
                continue;
            } //visitCommaExpression - start em.getName() as Imie, em.getSurname() as Nazwisko, em.getSalary() as Pensja
              //visitCommaExpression - start em.getName() as Imie, em.getSurname() as Nazwisko
              //visitAsExpression - start em.getName() as Imie
              //visitDotExpression - start em.getName()
              //visitIdentifierExpression - start em

            edu.pjwstk.kor.model.Employee _ident_em1 = _dotEl5;

            //visitIdentifierExpression - end em
            edu.pjwstk.kor.model.Employee _dotEl2 = _ident_em1;

            //visitMethodExpression - start getName()
            java.lang.String _mth_getNameResult = _dotEl2.getName();

            //visitMethodExpression - end getName()
            //visitDotExpression - end em.getName()
            java.lang.String _asResult_Imie = _mth_getNameResult;

            //visitAsExpression - end em.getName() as Imie
            //visitAsExpression - start em.getSurname() as Nazwisko
            //visitDotExpression - start em.getSurname()
            //visitIdentifierExpression - start em
            edu.pjwstk.kor.model.Employee _ident_em2 = _dotEl5;

            //visitIdentifierExpression - end em
            edu.pjwstk.kor.model.Employee _dotEl3 = _ident_em2;

            //visitMethodExpression - start getSurname()
            java.lang.String _mth_getSurnameResult = _dotEl3.getSurname();

            //visitMethodExpression - end getSurname()
            //visitDotExpression - end em.getSurname()
            java.lang.String _asResult_Nazwisko = _mth_getSurnameResult;

            //visitAsExpression - end em.getSurname() as Nazwisko
            //OperatorComma - start em.getName() as Imie, em.getSurname() as Nazwisko
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult = OperatorUtils.cartesianProductSS(_asResult_Imie,
                    _asResult_Nazwisko, "Imie", "Nazwisko");

            //OperatorComma - end em.getName() as Imie, em.getSurname() as Nazwisko
            //visitCommaExpression - end em.getName() as Imie, em.getSurname() as Nazwisko
            //visitAsExpression - start em.getSalary() as Pensja
            //visitDotExpression - start em.getSalary()
            //visitIdentifierExpression - start em
            edu.pjwstk.kor.model.Employee _ident_em3 = _dotEl5;

            //visitIdentifierExpression - end em
            edu.pjwstk.kor.model.Employee _dotEl4 = _ident_em3;

            //visitMethodExpression - start getSalary()
            java.lang.Integer _mth_getSalaryResult1 = _dotEl4.getSalary();

            //visitMethodExpression - end getSalary()
            //visitDotExpression - end em.getSalary()
            java.lang.Integer _asResult_Pensja = _mth_getSalaryResult1;

            //visitAsExpression - end em.getSalary() as Pensja
            //OperatorComma - start em.getName() as Imie, em.getSurname() as Nazwisko, em.getSalary() as Pensja
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult1 = OperatorUtils.cartesianProductSS(_commaResult,
                    _asResult_Pensja, "", "Pensja");
            //OperatorComma - end em.getName() as Imie, em.getSurname() as Nazwisko, em.getSalary() as Pensja
            //visitCommaExpression - end em.getName() as Imie, em.getSurname() as Nazwisko, em.getSalary() as Pensja
            _queryResult.add(_commaResult1);
            _dotIndex5++;
        }

        //visitDotExpression - end dataBase.(Employee as em where em.getSalary() < param).(em.getName() as Imie, em.getSurname() as Nazwisko, em.getSalary() as Pensja)
        return _queryResult;

        //evaluateExpression - end dataBase.(Employee as em where em.getSalary() < param).(em.getName() as Imie, em.getSurname() as Nazwisko, em.getSalary() as Pensja)
    }
}
