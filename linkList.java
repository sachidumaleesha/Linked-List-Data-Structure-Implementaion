class linkList {
  public Link first;

  public linkList() {
    first = null;
  }

  public boolean isEmpty() {
    return (first == null);
  }

  public void displayList() {
    Link cur = first;

    while (cur != null) {
      cur.displayLink();
      cur = cur.next;
    }
  }

  public boolean find(int key) {
    Link cur = first;

    while (cur != null) {
      if (cur.iData == key) {
        return true;
      } else {
        cur = cur.next;
      }
    }
    return false;
  }

  /*
   * public Link find(int key) {
   * Link cur = first;
   * 
   * while (cur != null) {
   * if (cur.iData == key) {
   * return cur;
   * } else {
   * cur = cur.next;
   * }
   * }
   * return null;
   * }
   */

  public void insertFirst(int key) {
    Link newLink = new Link(key);
    newLink.next = first;
    first = newLink;
  }

  public boolean insertAfter(int key, int newData) {
    Link newLink = new Link(newData);

    Link cur = first;

    while (cur != null) {
      if (cur.iData == key) {
        newLink.next = cur.next;
        cur.next = newLink;
        return true;
      } else {
        cur = cur.next;
      }
    }
    return false;
  }

  public Link deleteFirst() {
    Link temp = first;
    first = first.next;

    return temp;
  }

  public boolean delete(int key) {
    Link cur = first;
    Link pre = first;

    while (cur != null) {
      if (cur.iData == key) {
        if (cur == first) {
          first = first.next;
          return true;
        } else {
          pre.next = cur.next;
          return true;
        }
      } else {
        pre = cur;
        cur = cur.next;
      }
    }
    return false;
  }

}