package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static rocks.zipcode.io.quiz3.collections.Student.LabStatus.PENDING;
import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;


/**
 * @author leon on 10/12/2018.
 */
public class Student {

    enum LabStatus { COMPLETED , INCOMPLETED, PENDING; }

    private Map<Lab,LabStatus> map ;

    public Student() {
        this(null);
    }


    Map<String,LabStatus> statusMap = new HashMap<>();

    public Student(Map<Lab, LabStatus> map) {
        this.map = new HashMap<>();
    }

    public Lab getLab(String labName) {
       LabStatus value =  statusMap.get(labName);
       Lab key = null;
        for(Map.Entry entry: map.entrySet()){
            if(value.equals(entry.getValue())){
                key = (Lab) entry.getKey();
                break;}
        }
        return key;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
       statusMap.put(labName,labStatus);
    }


    public void forkLab(Lab lab) {

        LabStatus value = map.get(lab);
        value.equals(PENDING);
    }

    public LabStatus getLabStatus(String labName) {
//        throw new UnsupportedOperationException("Method not yet implemented");

        LabStatus labStatus = statusMap.get(labName);
        return labStatus;
    }
}
