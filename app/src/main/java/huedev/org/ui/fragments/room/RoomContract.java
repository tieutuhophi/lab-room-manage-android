package huedev.org.ui.fragments.room;

import java.util.List;

import huedev.org.data.model.Room;
import huedev.org.ui.base.BasePresenter;
import huedev.org.ui.base.BaseView;

public interface RoomContract {
    interface View extends BaseView {
        void updateRoomsList(List<Room> roomList);
    }
    interface Presenter extends BasePresenter<View> {
        void rooms();
    }
}
