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


public class MyQuery_SbqlQuery27 {
    private com.db4o.ObjectContainer dataBase;

    public MyQuery_SbqlQuery27(final com.db4o.ObjectContainer dataBase) {
        this.dataBase = dataBase;
    }

    /**
     * original query='dataBase.( (Shipment as sh where sh.isComplaint == true join sh.sndr as sn join sh.rcvr as rc ).(sh.sendDate as DataWyslania, sh.sndr.surname as Od, sh.deliveredDate as DataDostarczenia, sh.rcvr.surname as Do) )'
     *
     * query after optimization='dataBase.(Shipment as sh where sh.getIsComplaint() == true join sh.getSndr() as sn join sh.getRcvr() as rc).(sh.getSendDate() as DataWyslania, sh.getSndr().getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, sh.getRcvr().getSurname() as Do)'
    */
    public java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> executeQuery() {
        //evaluateExpression - start dataBase.(Shipment as sh where sh.getIsComplaint() == true join sh.getSndr() as sn join sh.getRcvr() as rc).(sh.getSendDate() as DataWyslania, sh.getSndr().getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, sh.getRcvr().getSurname() as Do)
        //visitDotExpression - start dataBase.(Shipment as sh where sh.getIsComplaint() == true join sh.getSndr() as sn join sh.getRcvr() as rc).(sh.getSendDate() as DataWyslania, sh.getSndr().getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, sh.getRcvr().getSurname() as Do)
        //visitIdentifierExpression - start dataBase
        com.db4o.ObjectContainer _ident_dataBase = dataBase;

        //visitIdentifierExpression - end dataBase
        java.util.Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _queryResult =
            _ident_dataBase.query(new MyQuery_SbqlQuery27Db4o0());

        return _queryResult;

        //evaluateExpression - end dataBase.(Shipment as sh where sh.getIsComplaint() == true join sh.getSndr() as sn join sh.getRcvr() as rc).(sh.getSendDate() as DataWyslania, sh.getSndr().getSurname() as Od, sh.getDeliveredDate() as DataDostarczenia, sh.getRcvr().getSurname() as Do)
    }
}
