BEFORE
public int remain(int amount) {
    return boundary - amount % boundary;
}
AFTER
public int remain(int amount) {
    int result = boundary - amount % boundary;
    return result == boundary ? 0 : result;
}
