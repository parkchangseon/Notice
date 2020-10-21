package hotelmanage;

import javax.persistence.*;

@Entity
@Table(name="RoomInfo_table")
public class RoomInfo {

    @Id @GeneratedValue
    private Integer roomNumber;
    private String roomName;
    private Integer reserveNo;
    private Integer customerId;
    private String reserveStatus;
    private String roomStatus;

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getReserveNo() {
        return reserveNo;
    }

    public void setReserveNo(Integer reserveNo) {
        this.reserveNo = reserveNo;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getReserveStatus() {
        return reserveStatus;
    }

    public void setReserveStatus(String reserveStatus) {
        this.reserveStatus = reserveStatus;
    }

    /*public Integer getRoomScore() {
        return roomScore;
    }
    public void setRoomScore(Integer roomScore) {
        this.roomScore = roomScore;
    }
    public Integer getRoomScoreCnt() {
        return roomScoreCnt;
    }
    public void setRoomScoreCnt(Integer roomScoreCnt) {
        this.roomScoreCnt = roomScoreCnt;
    }*/

}
