package edu.pjwstk.kor.queries;

import com.db4o.ObjectContainer;

import edu.pjwstk.kor.model.*;
import edu.pjwstk.kor.model.Shipment;
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


public class MyQuery_SbqlQuery6 {
    private com.db4o.ObjectContainer dataBase;

    public MyQuery_SbqlQuery6(final com.db4o.ObjectContainer dataBase) {
        this.dataBase = dataBase;
    }

    /**
     * original query='dataBase.(Shipment as sh where sh.isComplaint == true ).( sh.sendDate as dataWys , sh.deliveredDate as dataDost , sh.emplyDelivering.name as imiePrac, sh.emplyDelivering.surname as nazwiskoPrac)'
     *
     * query after optimization='dataBase.(Shipment as sh where sh.getIsComplaint() == true).(sh.getSendDate() as dataWys, sh.getDeliveredDate() as dataDost, sh.getEmplyDelivering().getName() as imiePrac, sh.getEmplyDelivering().getSurname() as nazwiskoPrac)'
    */
    public java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> executeQuery() {
        //evaluateExpression - start dataBase.(Shipment as sh where sh.getIsComplaint() == true).(sh.getSendDate() as dataWys, sh.getDeliveredDate() as dataDost, sh.getEmplyDelivering().getName() as imiePrac, sh.getEmplyDelivering().getSurname() as nazwiskoPrac)
        //visitDotExpression - start dataBase.(Shipment as sh where sh.getIsComplaint() == true).(sh.getSendDate() as dataWys, sh.getDeliveredDate() as dataDost, sh.getEmplyDelivering().getName() as imiePrac, sh.getEmplyDelivering().getSurname() as nazwiskoPrac)
        //visitDotExpression - start dataBase.(Shipment as sh where sh.getIsComplaint() == true)
        //visitIdentifierExpression - start dataBase
        com.db4o.ObjectContainer _ident_dataBase = dataBase;

        //visitIdentifierExpression - end dataBase
        java.util.Collection<edu.pjwstk.kor.model.Shipment> _dotResult1 = _ident_dataBase.query(new MyQuery_SbqlQuery6Db4o0());
        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _queryResult =
            new java.util.ArrayList<pl.wcislo.sbql4j.java.model.runtime.Struct>();
        int _dotIndex8 = 0;

        for (edu.pjwstk.kor.model.Shipment _dotEl8 : _dotResult1) {
            if (_dotEl8 == null) {
                continue;
            } //visitCommaExpression - start sh.getSendDate() as dataWys, sh.getDeliveredDate() as dataDost, sh.getEmplyDelivering().getName() as imiePrac, sh.getEmplyDelivering().getSurname() as nazwiskoPrac
              //visitCommaExpression - start sh.getSendDate() as dataWys, sh.getDeliveredDate() as dataDost, sh.getEmplyDelivering().getName() as imiePrac
              //visitCommaExpression - start sh.getSendDate() as dataWys, sh.getDeliveredDate() as dataDost
              //visitAsExpression - start sh.getSendDate() as dataWys
              //visitDotExpression - start sh.getSendDate()
              //visitIdentifierExpression - start sh

            edu.pjwstk.kor.model.Shipment _ident_sh1 = _dotEl8;

            //visitIdentifierExpression - end sh
            edu.pjwstk.kor.model.Shipment _dotEl2 = _ident_sh1;

            //visitMethodExpression - start getSendDate()
            java.util.Date _mth_getSendDateResult = _dotEl2.getSendDate();

            //visitMethodExpression - end getSendDate()
            //visitDotExpression - end sh.getSendDate()
            java.util.Date _asResult_dataWys = _mth_getSendDateResult;

            //visitAsExpression - end sh.getSendDate() as dataWys
            //visitAsExpression - start sh.getDeliveredDate() as dataDost
            //visitDotExpression - start sh.getDeliveredDate()
            //visitIdentifierExpression - start sh
            edu.pjwstk.kor.model.Shipment _ident_sh2 = _dotEl8;

            //visitIdentifierExpression - end sh
            edu.pjwstk.kor.model.Shipment _dotEl3 = _ident_sh2;

            //visitMethodExpression - start getDeliveredDate()
            java.util.Date _mth_getDeliveredDateResult = _dotEl3.getDeliveredDate();

            //visitMethodExpression - end getDeliveredDate()
            //visitDotExpression - end sh.getDeliveredDate()
            java.util.Date _asResult_dataDost = _mth_getDeliveredDateResult;

            //visitAsExpression - end sh.getDeliveredDate() as dataDost
            //OperatorComma - start sh.getSendDate() as dataWys, sh.getDeliveredDate() as dataDost
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult = OperatorUtils.cartesianProductSS(_asResult_dataWys,
                    _asResult_dataDost, "dataWys", "dataDost");

            //OperatorComma - end sh.getSendDate() as dataWys, sh.getDeliveredDate() as dataDost
            //visitCommaExpression - end sh.getSendDate() as dataWys, sh.getDeliveredDate() as dataDost
            //visitAsExpression - start sh.getEmplyDelivering().getName() as imiePrac
            //visitDotExpression - start sh.getEmplyDelivering().getName()
            //visitDotExpression - start sh.getEmplyDelivering()
            //visitIdentifierExpression - start sh
            edu.pjwstk.kor.model.Shipment _ident_sh3 = _dotEl8;

            //visitIdentifierExpression - end sh
            edu.pjwstk.kor.model.Shipment _dotEl4 = _ident_sh3;

            //visitMethodExpression - start getEmplyDelivering()
            edu.pjwstk.kor.model.Employee _mth_getEmplyDeliveringResult = _dotEl4.getEmplyDelivering();

            //visitMethodExpression - end getEmplyDelivering()
            //visitDotExpression - end sh.getEmplyDelivering()
            edu.pjwstk.kor.model.Employee _dotEl5 = _mth_getEmplyDeliveringResult;

            //visitMethodExpression - start getName()
            java.lang.String _mth_getNameResult = _dotEl5.getName();

            //visitMethodExpression - end getName()
            //visitDotExpression - end sh.getEmplyDelivering().getName()
            java.lang.String _asResult_imiePrac = _mth_getNameResult;

            //visitAsExpression - end sh.getEmplyDelivering().getName() as imiePrac
            //OperatorComma - start sh.getSendDate() as dataWys, sh.getDeliveredDate() as dataDost, sh.getEmplyDelivering().getName() as imiePrac
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult1 = OperatorUtils.cartesianProductSS(_commaResult,
                    _asResult_imiePrac, "", "imiePrac");

            //OperatorComma - end sh.getSendDate() as dataWys, sh.getDeliveredDate() as dataDost, sh.getEmplyDelivering().getName() as imiePrac
            //visitCommaExpression - end sh.getSendDate() as dataWys, sh.getDeliveredDate() as dataDost, sh.getEmplyDelivering().getName() as imiePrac
            //visitAsExpression - start sh.getEmplyDelivering().getSurname() as nazwiskoPrac
            //visitDotExpression - start sh.getEmplyDelivering().getSurname()
            //visitDotExpression - start sh.getEmplyDelivering()
            //visitIdentifierExpression - start sh
            edu.pjwstk.kor.model.Shipment _ident_sh4 = _dotEl8;

            //visitIdentifierExpression - end sh
            edu.pjwstk.kor.model.Shipment _dotEl6 = _ident_sh4;

            //visitMethodExpression - start getEmplyDelivering()
            edu.pjwstk.kor.model.Employee _mth_getEmplyDeliveringResult1 = _dotEl6.getEmplyDelivering();

            //visitMethodExpression - end getEmplyDelivering()
            //visitDotExpression - end sh.getEmplyDelivering()
            edu.pjwstk.kor.model.Employee _dotEl7 = _mth_getEmplyDeliveringResult1;

            //visitMethodExpression - start getSurname()
            java.lang.String _mth_getSurnameResult = _dotEl7.getSurname();

            //visitMethodExpression - end getSurname()
            //visitDotExpression - end sh.getEmplyDelivering().getSurname()
            java.lang.String _asResult_nazwiskoPrac = _mth_getSurnameResult;

            //visitAsExpression - end sh.getEmplyDelivering().getSurname() as nazwiskoPrac
            //OperatorComma - start sh.getSendDate() as dataWys, sh.getDeliveredDate() as dataDost, sh.getEmplyDelivering().getName() as imiePrac, sh.getEmplyDelivering().getSurname() as nazwiskoPrac
            pl.wcislo.sbql4j.java.model.runtime.Struct _commaResult2 = OperatorUtils.cartesianProductSS(_commaResult1,
                    _asResult_nazwiskoPrac, "", "nazwiskoPrac");
            //OperatorComma - end sh.getSendDate() as dataWys, sh.getDeliveredDate() as dataDost, sh.getEmplyDelivering().getName() as imiePrac, sh.getEmplyDelivering().getSurname() as nazwiskoPrac
            //visitCommaExpression - end sh.getSendDate() as dataWys, sh.getDeliveredDate() as dataDost, sh.getEmplyDelivering().getName() as imiePrac, sh.getEmplyDelivering().getSurname() as nazwiskoPrac
            _queryResult.add(_commaResult2);
            _dotIndex8++;
        }

        //visitDotExpression - end dataBase.(Shipment as sh where sh.getIsComplaint() == true).(sh.getSendDate() as dataWys, sh.getDeliveredDate() as dataDost, sh.getEmplyDelivering().getName() as imiePrac, sh.getEmplyDelivering().getSurname() as nazwiskoPrac)
        return _queryResult;

        //evaluateExpression - end dataBase.(Shipment as sh where sh.getIsComplaint() == true).(sh.getSendDate() as dataWys, sh.getDeliveredDate() as dataDost, sh.getEmplyDelivering().getName() as imiePrac, sh.getEmplyDelivering().getSurname() as nazwiskoPrac)
    }
}
