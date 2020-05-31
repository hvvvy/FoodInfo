package abc;

public class Sorting {
	public void sort(String foodName,int grams) {
		Carbohydrates car = new Carbohydrates();
		Meats meat = new Meats();
		Vegetables veg = new Vegetables();
		switch(foodName) {

		//炭水化物ゾーン
		//米類
		case "米":
			car.rice(grams);
			break;
		case "玄米":
			car.brownRice(grams);
		case "赤飯":
			car.redRice(grams);
			break;
		case "もち":
		case "モチ":
		case "餅":
			car.riceCake(grams);
			break;

		//パン類
		case "フランスパン":
			car.frenchBread(grams);
			break;
		case "ナン":
			car.nan(grams);
			break;

		//麺類
		case "うどん":
			car.udon(grams);
			break;
		case "そうめん":
			car.somen(grams);
			break;
		case "スパゲッティ":
			car.spaghetti(grams);
			break;
		case "そば":
		case "蕎麦":
			car.soba(grams);
			break;
		case "ラーメン":
			car.ramen(grams);
			break;
		case "醤油ラーメン":
			car.soySauceRamen(grams);
			break;
		case "味噌ラーメン":
			car.misoRamen(grams);
			break;
		case "塩ラーメン":
			car.saltRamen(grams);
			break;
		case "五目ラーメン":
			car.gomokuRamen(grams);
			break;

		//ナッツ類
		case "落花生":
		case "ピーナッツ":
			car.peanut(grams);
			break;
		case "くるみ":
			car.walnut(grams);
			break;
		case "アーモンド":
			car.almond(grams);
			break;
		case "カシューナッツ":
			car.cashew(grams);
			break;
		case "マカダミアナッツ":
			car.macadamia(grams);
			break;

		//その他
		case "オリーブオイル":
		case "サラダ油":
		case "ごま油":
			car.oil(grams);
			break;

		//肉ゾーン
		//鶏肉
		case "皮なし鶏胸肉":
		case "鶏胸肉皮なし":
			meat.skinlessChickenBreast(grams);
			break;
		case "鶏胸肉":
			meat.chickenBreast(grams);
			break;
		case "鶏モモ肉":
			meat.darkMeat(grams);
			break;
		case "ささみ":
			meat.chickenBreastTender(grams);
			break;
		case "レバー":
			meat.chickenLever(grams);
			break;
		case "鶏皮":
			meat.chickenSkin(grams);
			break;
		case "砂肝":
			meat.gizzard(grams);
			break;

		//牛肉
		case "牛肉":
			meat.beef(grams);
			break;
		case "牛筋":
			meat.beefSinew(grams);
			break;

		//豚肉
		case "豚肉":
			meat.pork(grams);
			break;
		case "チャーシュー":
			meat.barbecuedPork(grams);
			break;
		case "角煮":
			meat.boiledCube(grams);
			break;

		//卵・乳製品
		case "卵":
			meat.egg(grams);
			break;
		case "ウズラの卵":
			meat.quailEggs(grams);
			break;
		case "卵黄":
			meat.eggYolk(grams);
			break;
		case "卵白":
			meat.eggWhite(grams);
			break;
		case "牛乳":
			meat.milk(grams);
			break;
		case "低脂肪牛乳":
			meat.lowFatMilk(grams);
			break;
		case "コーヒー牛乳":
			meat.coffeeMilk(grams);
			break;
		case "フルーツ牛乳":
			meat.fruitMilk(grams);
			break;
		case "カマンベールチーズ":
			meat.camembertCheese(grams);
			break;
		case "クリームチーズ":
			meat.creamCheese(grams);
			break;
		case "チェダーチーズ":
			meat.cheddarCheese(grams);
			break;
		case "マヨネーズ":
			meat.mayonnaise(grams);
			break;
		case "バター":
			meat.butter(grams);
			break;
		case "無塩バター":
			meat.saltFreeButter(grams);
			break;
		case "マーガリン":
			meat.margarine(grams);
			break;
		case "ヨーグルト":
			meat.yogurt(grams);
			break;

		//野菜ゾーン
		//一般野菜
		case "きゅうり":
			veg.cucamber(grams);
			break;
		case "アスパラガス":
			veg.asparagus(grams);
			break;
		case "オクラ":
			veg.okra(grams);
			break;
		case "かぼちゃ":
			veg.pumpkin(grams);
			break;
		case "ブロッコリー":
			veg.broccoli(grams);
			break;
		case "カリフラワー":
			veg.cauliFlower(grams);
			break;
		case "キャベツ":
			veg.cabbage(grams);
			break;
		case "小松菜":
			veg.komatsuna(grams);
			break;
		case "春菊":
			veg.garlandChrysanthemnm(grams);
			break;
		case "生姜":
			veg.ginger(grams);
			break;
		case "セロリ":
			veg.celery(grams);
			break;
		case "タケノコ":
			veg.bambooshoot(grams);
			break;
		case "玉ねぎ":
			veg.onion(grams);
			break;
		case "青梗菜":
			veg.bokChoy(grams);
			break;
		case "とうもろこし":
			veg.corn(grams);
			break;
		case "トマト":
			veg.tomato(grams);
			break;
		case "ミニトマト":
			veg.miniTomato(grams);
			break;
		case "ナス":
			veg.eggplant(grams);
			break;
		case "ニラ":
			veg.chineseChive(grams);
			break;
		case "ニンニク":
			veg.garlic(grams);
			break;
		case "白菜":
			veg.chineseChive(grams);
			break;
		case "レタス":
			veg.lettuce(grams);
			break;
		case "ピーマン":
			veg.greenPepper(grams);
			break;
		case "ほうれん草":
			veg.spinach(grams);
			break;

		//芋類
		case "さつまいも":
		case "サツマイモ":
			veg.sweetPotato(grams);
			break;
		case "里芋":
			veg.taro(grams);
			break;
		case "じゃがいも":
			veg.potatoes(grams);
			break;
		case "山芋":
			veg.yam(grams);
			break;

		//根菜類
		case "かぶ":
			veg.radish(grams);
			break;
		case "ゴボウ":
			veg.burdock(grams);
			break;
		case "大根":
			veg.japaneseRadish(grams);
			break;
		case "レンコン":
			veg.lotusRoot(grams);
			break;
		case "にんじん":
			veg.carrot(grams);
			break;

		//豆類
		case "インゲン":
			veg.greenBeans(grams);
			break;
		case "枝豆":
			veg.edamame(grams);
			break;
		case "さやえんどう":
			veg.sayaPea(grams);
			break;
		case "そら豆":
			veg.broadBeans(grams);
			break;
		case "もやし":
			veg.beanSprouts(grams);
			break;

		//菌類
		case "えのき":
			veg.enoki(grams);
			break;
		case "しいたけ":
			veg.shiitake(grams);
			break;
		case "ぶなしめじ":
			veg.bushes(grams);
			break;
		case "マイタケ":
			veg.maitake(grams);
			break;
		case "マッシュルーム":
			veg.mushroom(grams);
			break;
		case "エリンギ":
			veg.eringi(grams);
			break;
		case "なめこ":
			veg.nameko(grams);
			break;

		default:
			System.out.println("食材の名前を入力してください");
		}
	}
}
