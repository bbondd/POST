package TransactionManage;

import java.util.LinkedList;

public class RefundManager {
    LinkedList<Receipt> receipts = new LinkedList<>();

    public Receipt add(Receipt receipt) {
        receipts.add(receipt);
        return receipt;
    }

    public Receipt find(String receiptId) {
        for(Receipt receipt : receipts)
            if(receipt.id.equals(receiptId))
                return receipt;
        return null;
    }



}
