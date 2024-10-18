//package org.example.day6.crolling;
//
//import org.jsoup.Jsoup;
//
//import javax.lang.model.element.Element;
//import javax.lang.model.util.Elements;
//
//public class Test2 {
//    public static <Document> void main(String[] args) {
//        try {
//            String[] movies = new String[100];
//            String[] price = new String[100];
//            int iter = 0;
//
//
//
//
//
//
//            // URL로부터 HTML 문서 가져오기
//            String url = "https://serieson.naver.com/v3/movie/ranking/realtime";  // 원하는 URL로 변경
//            Document document = Jsoup.connect(url).get();
//
//            // 특정 HTML 요소 추출 (예: <a> 태그)
//            Elements links = document.select("a[href]");  // 모든 링크를 가져옴
//
//            // 링크 출력
//            for (Element link : links) {
//                if (link.attr("href").contains("/v2/movie/")) {
//
//                    movies[iter] = link.text().substring(11)
//                            .replace("HOT ", "")
//                            .replace("자막 ", "")
//                            .replace("33% ", "")
//                            .replace("더빙 ", "");
//                    iter++;
//                }
//            }
//
//            for (int i = 0; i < 100; i++) {
//                String[] temp = movies[i].split(" ");
//                for (int j = 0; j < temp.length; j++) {
//                    if (temp[j].contains("상승") || temp[j].contains("하락")) {
//                        temp[j] = "";
//                    }
//                    if (temp[j].contains("구매") || temp[j].contains("대여")) {
//                        price[i] = temp[j].replace("구매", "")
//                                .replace("대여", "");
//                        temp[j] = "";
//                    }
//                    if (temp[j].contains("캐시")) {
//                        temp[j] = "";
//                    }
//                }
//                movies[i] = String.join(" ", temp);
//
//
//            }
//
//
//            for (int i = 0; i < 100; i++) {
//
//                System.out.println(movies[i]);
//                System.out.println(price[i]);
//            }
//
//            JFrame frame = new JFrame("실시간 영화 목록");
//            frame.setSize(500, 300);
//
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            FlowLayout flowLayout = new FlowLayout();
//            frame.setLayout(flowLayout);
//
//            JTextArea area = new JTextArea(10, 20);
//            for (int i = 0; i < 10; i++) {
//                area.append(movies[i]+" 가격은 : "+price[i] + "\n");
//            }
//            frame.add(area);
//
//
//            JLabel label = new JLabel("정보를 확인하고 싶은 번호를 입력하세요. : ");
//            JTextField textField = new JTextField(10);
//            JButton okBtn = new JButton("확인");
//
//            okBtn.addActionListener(new ActionListener() {
//
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    int choose = Integer.parseInt(textField.getText().toString());
//
//                    String temp_str = "선택한 영화 : " + movies[choose-1] + "\n가격 : "+price[choose-1];
//
//                    JOptionPane.showMessageDialog(frame,temp_str);
//                }
//            });
//
//
//
//
//            frame.add(label);
//            frame.add(textField);
//            frame.add(okBtn);
//
//
//
//
//            frame.setVisible(true);
//
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//    }
//}
